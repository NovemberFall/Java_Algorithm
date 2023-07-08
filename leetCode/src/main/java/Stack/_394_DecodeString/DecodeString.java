package Stack._394_DecodeString;

import java.util.Stack;

/*
        Example 1:
        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"

        Example 2:
        Input: s = "3[a2[c]]"
        Output: "accaccacc"

        stk[ "3", "[",
 */
public class DecodeString {
    public String decodeString(String s) {
        if (s.length() == 0) return "";
        Stack<String> stk = new Stack<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                stk.push(String.valueOf(num));
                stk.push("["); //use [ as a marker, we don't have to check whether an item is a number or not
                num = 0;
            } else if (c == ']') {
                StringBuilder str = new StringBuilder();
                //keep pop until meet '['
                while (!stk.peek().equals("[")) {
                    str.insert(0, stk.pop());
                }
                stk.pop(); //pop '['
                int repeat = Integer.parseInt(stk.pop());
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < repeat; k++) {
                    sb.append(str);
                }
                stk.push(sb.toString());
            } else {
                stk.push(String.valueOf(c));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stk.isEmpty()) {
            ans.insert(0, stk.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        String str = "3[a2[c]]";
        String res = ds.decodeString(str);
        System.out.println(res);
    }
}

package String;

class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            if (Character.isLetterOrDigit(chars[i])) {
                sb.append(chars[i]);
            }
        }

        String res = sb.toString();
        int l = 0, r = res.length() - 1;
        while (l < r) {
            if (res.charAt(l) != res.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


    public boolean isPalindrome_regularExpression(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]", "");
        int l = 0, r = res.length() - 1;
        while (l < r) {
            if (res.charAt(l) != res.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

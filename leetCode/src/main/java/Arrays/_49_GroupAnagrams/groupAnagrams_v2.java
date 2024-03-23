package Arrays._49_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class groupAnagrams_v2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> dict = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            String keyStr = Arrays.toString(freq);
            dict.putIfAbsent(keyStr, new ArrayList<>());
            dict.get(keyStr).add(str);
        }

        for (List<String> list : dict.values()) {
            res.add(list);
        }
        return res;
    }
}

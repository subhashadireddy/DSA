class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> need = new HashMap<>();

        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int have = 0;
        int needCount = need.size();

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            window.put(ch,
                window.getOrDefault(ch, 0) + 1);

            if(need.containsKey(ch) &&
               window.get(ch).intValue() ==
               need.get(ch).intValue()) {

                have++;
            }

            while(have == needCount) {

                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                window.put(leftChar,
                    window.get(leftChar) - 1);

                if(need.containsKey(leftChar) &&
                   window.get(leftChar) <
                   need.get(leftChar)) {

                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}

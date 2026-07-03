package Example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

        /*public static int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int left = 0;
            int maxLength = 0;

            for (int right = 0; right < s.length(); right++) {
                char ch = s.charAt(right);

                if (map.containsKey(ch) && map.get(ch) >= left) {
                    left = map.get(ch) + 1;
                }

                map.put(ch, right);
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }*/

        public static void main(String[] args) {
            String str = "anilkumarnani";
            System.out.println(lengthOfLongestSubstring(str)); // Output: 3
        }

    private static int lengthOfLongestSubstring(String str) {
            Map<Character,Integer> map =new HashMap<>();
            int left  =0;
            int maxLength =0;
            for(int right=0; right<str.length();right++){
                char ch  =str.charAt(right);
                if(map.containsKey(ch) && map.get(ch)>=left){
                    left=map.get(ch)+1;
                }
                map.put(ch,right);
                maxLength=Math.max(maxLength,right-left+1);
                System.out.println(map.toString());
            }
        return maxLength;
    }
}

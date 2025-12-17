// Longest Substring Without Repeating Characters Optimal

import java.util.*;

class LongestSubstringOptimal {

    static int longestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {

            // remove characters until duplicate is gone
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = sc.nextLine();

        System.out.println("Longest substring length: " + longestSubstring(s));
    }
}

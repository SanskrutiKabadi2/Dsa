// // Longest Substring Without Repeating Characters Brute Force
import java.util.*;

class LongestSubstringBrute {

    static boolean isUnique(String s, int start, int end) {
        HashSet<Character> set = new HashSet<>();

        for (int i = start; i <= end; i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }

    static int longestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isUnique(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
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

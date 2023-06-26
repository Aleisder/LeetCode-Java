/*
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */

class Solution {
    public int strStr(String haystack, String needle) {
        int base = 0;
        int delta = 0;
        while (base + delta < haystack.length()) {
            if (haystack.charAt(base + delta) == needle.charAt(delta)) {
                if (delta + 1 == needle.length()) {
                    return base;
                }
                delta++;
            } else {
                base++;
                delta = 0;
            }
        }
        return -1;
    }
}
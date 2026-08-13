// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem     Java Substring
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 07:52 p.m.
// Technique   character-array-iteration
// Time        O(end - start)
// Space       O(n)
// Insight     The implementation iterates through the character array from the start index up to, but not including, the end index to print the required substring.
// Interview   Before: "I would use the built-in substring method." After: "I manually iterated through the character array to print the range, which takes O(end - start) time and O(n) space to store the array, ensuring the end index is treated as exclusive."
// Pitfalls    (1) The loop condition i < end correctly excludes the end index, which is a common source of off-by-one errors.  (2) Converting the entire string to a character array consumes O(n) extra space, which may be inefficient for very large strings.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        char[] ch=S.toCharArray();
        for(int i=start;i<end;i++){
            System.out.print(ch[i]);
        }
    }
}

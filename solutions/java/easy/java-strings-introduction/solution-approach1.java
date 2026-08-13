// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 07:47 p.m.
// Technique   string-manipulation-and-lexicographical-compari…
// Time        O(N + M)
// Space       O(N + M)
// Insight     The solution utilizes the built-in compareTo method for lexicographical ordering and substring concatenation to capitalize the first character of each input string.
// Interview   Before: "How do I compare strings lexicographically in Java?" After: "Use the compareTo method, which returns a positive integer if the first string is lexicographically greater. This approach runs in O(N + M) time, where N and M are the lengths of the strings, as it iterates through the character sequences."
// Pitfalls    (1) Using the == operator instead of compareTo for lexicographical comparison will compare object references rather than string content.  (2) Calling substring(0, 1) on an empty string will throw a StringIndexOutOfBoundsException, though the problem constraints imply non-empty inputs.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum=(A.length()+B.length());
        System.out.println(sum);
        if (A.compareTo(B) > 0) {
        System.out.println("Yes");
         }else{
             System.out.println("No");
         }
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);
        
    }
}




// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-07-28, 10:34 p.m.
// Technique   for-loop-multiplication-table
// Time        O(1)
// Space       O(1)
// Insight     The implementation iterates through the integer range [1, 10] to compute and print the product of the input N and the current loop index i.
// Interview   Before: "How would you print the first 10 multiples of N?" After: "I would use a simple for-loop from 1 to 10 to calculate N*i, resulting in O(1) time and space complexity, as the number of iterations is fixed regardless of N."
// Pitfalls    (1) Using an incorrect loop range such as 0 to 9 instead of 1 to 10, which violates the requirement to print the first 10 multiples.  (2) Failing to format the output string exactly as 'N x i = result' as specified in the problem statement.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

             for(int i=1;i<=10;i++){
                System.out.println(N+" x "+i+" = "+(N*i));
             }
         
        bufferedReader.close();
    }
}

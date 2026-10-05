// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-05, 10:36 p.m.
// Technique   scanner-has-next-line-loop
// Time        O(N)
// Space       O(1)
// Insight     The implementation uses a scanner to continuously poll for available lines until the end-of-file condition is met, incrementing a counter for each successful read.
// Interview   Before: "I would read the input using a fixed-size array or a loop with a known count." After: "Since the input size is unknown, I use Scanner.hasNextLine() to process lines until EOF in O(N) time, ensuring each line is numbered correctly regardless of total input length."
// Pitfalls    (1) Using hasNext() instead of hasNextLine() may cause the scanner to skip whitespace or fail to capture entire lines correctly.  (2) Failing to increment the line counter inside the loop results in incorrect line numbering for the output format.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int nextLine=1;
while(sc.hasNextLine())
 {    System.out.println(nextLine+" "+sc.nextLine());
 nextLine++;
 }
    sc.close();  
    }
}

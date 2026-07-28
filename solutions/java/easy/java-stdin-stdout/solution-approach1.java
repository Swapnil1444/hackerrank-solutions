// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem     Java Stdin and Stdout II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-07-28, 01:37 p.m.
// Technique   scanner-buffer-clearing
// Time        O(1)
// Space       O(1)
// Insight     The scanner requires an explicit call to nextLine() after reading numeric tokens to consume the trailing newline character before reading the subsequent string input.
// Interview   Before: "I am getting an empty string when reading the input." After: "The issue is that nextInt() and nextDouble() leave the newline character in the buffer, causing the nextLine() call to read an empty line. Consuming the newline with an extra nextLine() ensures O(1) correct input parsing."
// Pitfalls    (1) Failing to consume the newline character after nextInt() or nextDouble() causes the subsequent nextLine() to return an empty string.  (2) Assuming nextLine() behaves like next() when reading strings, which ignores whitespace instead of capturing the full line.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

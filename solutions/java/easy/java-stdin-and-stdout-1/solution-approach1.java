// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
// Problem      Java Stdin and Stdout I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-25, 03:42 p.m.
// Technique   scanner-sequential-read
// Time        O(1)
// Space       O(1)
// Insight     The implementation reads exactly three integers from the standard input stream using the Scanner class and prints each on a new line.
// Interview   Before: "How would you read three integers from stdin?" After: "I use the Scanner class to read three integers sequentially in O(1) time and O(1) space, ensuring each is printed on a new line as required by the problem constraints."
// Pitfalls    (1) Failing to handle potential InputMismatchException if the input stream contains non-integer values.  (2) Assuming the input stream always contains at least three integers, which may cause a NoSuchElementException if the input is insufficient.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

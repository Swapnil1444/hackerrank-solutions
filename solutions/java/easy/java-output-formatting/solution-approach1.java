// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-07-28, 01:50 p.m.
// Technique   printf-formatted-string-padding
// Time        O(1)
// Space       O(1)
// Insight     The implementation utilizes Java's printf format specifiers to enforce left-justification with a width of 15 for strings and zero-padding to a width of 3 for integers.
// Interview   Before: "I would manually pad the string and integer using loops." After: "Using printf with %-15s and %03d handles the formatting in O(1) time, ensuring the string is left-justified and the integer is zero-padded to three digits as required."
// Pitfalls    (1) Using %15s instead of %-15s results in right-justification, which violates the requirement for left-justification.  (2) Omitting the 0 in %03d causes the integer to be space-padded instead of zero-padded, failing the three-digit requirement.  (3) Failing to include the %n format specifier results in all output appearing on a single line, violating the line-by-line output format.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
        
                //Complete this line
            }
            
            System.out.println("================================");

    }
}




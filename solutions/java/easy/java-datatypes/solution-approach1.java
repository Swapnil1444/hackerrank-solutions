// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
// Problem     Java Datatypes
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-05, 10:27 p.m.
// Technique   range-check-exception-handling
// Time        O(T)
// Space       O(1)
// Insight     The solution uses Java's exception handling to identify inputs exceeding the 64-bit long range while performing sequential range checks for smaller primitive types.
// Interview   Before: "How do you check if a number fits in multiple primitive types?" After: "I use sequential range checks against constant bounds like Byte.MIN_VALUE. For inputs exceeding the long range, I catch the InputMismatchException to handle the O(T) complexity case where the number cannot be fitted anywhere."
// Pitfalls    (1) Failing to handle inputs larger than Long.MAX_VALUE, which causes an InputMismatchException.  (2) Incorrectly ordering the output to match the required size-based hierarchy.  (3) Assuming all inputs fit within a long without implementing the required catch block for overflow.
// ──────────────────────────────────────────────────

import java.util.*;
import java.io.*;
class Solution {
public static void main(String []argh) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for (int i = 0; i < t; i++) {
try {
long x = sc.nextLong();
System.out.println(x + " can be fitted in:");
if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
System.out.println("* byte");
if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
System.out.println("* short");
if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
System.out.println("* int");
System.out.println("* long");
}
catch (Exception e) {
System.out.println(sc.next() + " can't be fitted anywhere.");
}
}
sc.close();
}
}

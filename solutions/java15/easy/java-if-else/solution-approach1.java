// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-07-28, 12:16 p.m.
// Technique   nested-if-else-conditional-logic
// Time        O(1)
// Space       O(1)
// Insight     The implementation evaluates the parity and range of the integer N to determine the output string based on the specified conditional rules.
// Interview   Before: "I would use a series of if-else statements to check the parity and range of N." After: "The logic runs in O(1) time by checking the odd condition first, then partitioning the even cases into the three required ranges: 2-5, 6-20, and greater than 20."
// Pitfalls    (1) Failing to correctly handle the inclusive range boundaries for 2, 5, 6, and 20.  (2) Incorrectly grouping the even number conditions, leading to overlapping logic for values greater than 20.  (3) Neglecting the requirement to print 'Weird' for all odd numbers regardless of their magnitude.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N>0)
        {
            if(N%2==0){
                if(N>=2&&N<=5){
                    System.out.println("Not Weird");
                }
              else if(N>=6&&N<=20){
                System.out.println("Weird");
              }else{
                System.out.println("Not Weird");
              }  
            }else{
                System.out.println("Weird");
            }
        }


        
          
        bufferedReader.close();
    }
}

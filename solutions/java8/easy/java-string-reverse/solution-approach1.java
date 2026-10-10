// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-10, 11:19 a.m.
// Technique   string-reversal-concatenation
// Time        O(n^2)
// Space       O(n)
// Insight     The implementation constructs a reversed string by iterating backwards through the input and comparing it to the original using string equality.
// Interview   Before: "I will use a StringBuilder to reverse the string." After: "The current approach uses string concatenation in a loop, resulting in O(n^2) time complexity due to immutable string creation, which is inefficient for large inputs compared to O(n) using two pointers."
// Pitfalls    (1) String concatenation inside a loop creates multiple intermediate objects, leading to O(n^2) time complexity.  (2) The solution does not handle potential null inputs, which would cause a NullPointerException.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        checkPalindromString(A);
        
            
        }
        
        public static void checkPalindromString(String a){
            String value=a.toLowerCase();
            String rev="";
            for(int i=a.length()-1;i>=0;i--){
                rev+=value.charAt(i);
            }
            
            if(rev.equals(value)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }





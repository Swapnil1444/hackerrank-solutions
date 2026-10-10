// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-10, 11:19 a.m.
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





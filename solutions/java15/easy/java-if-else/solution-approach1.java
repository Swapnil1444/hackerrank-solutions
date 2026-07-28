// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-07-28, 12:16 p.m.
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

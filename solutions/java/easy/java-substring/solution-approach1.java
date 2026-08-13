// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem     Java Substring
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-13, 07:52 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        char[] ch=S.toCharArray();
        for(int i=start;i<end;i++){
            System.out.print(ch[i]);
        }
    }
}

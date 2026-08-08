// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
// Problem     Java 1D Array
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-08, 04:55 p.m.
// Technique   array-initialization-and-sequential-assignment
// Time        O(n)
// Space       O(n)
// Insight     The implementation initializes an array of size n and populates each index i with the corresponding input integer using a standard zero-indexed loop.
// Interview   Before: "I would use a dynamic list to store the inputs." After: "Since the size n is known upfront, using a fixed-size array is more memory-efficient, resulting in O(n) time and O(n) space complexity while ensuring direct index access."
// Pitfalls    (1) Attempting to access an index equal to or greater than n, which triggers an ArrayIndexOutOfBoundsException.  (2) Failing to initialize the array with the size n provided by the input, leading to incorrect storage capacity.
// ──────────────────────────────────────────────────


        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

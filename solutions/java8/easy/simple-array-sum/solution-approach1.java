// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
// Problem     Simple Array Sum
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-05, 10:54 p.m.
// Technique   enhanced-for-loop-summation
// Time        O(n)
// Space       O(n)
// Insight     The implementation iterates through the list once, accumulating each integer element into a running sum variable initialized to zero.
// Interview   Before: "I would use a standard for-loop with an index to access elements." After: "Using an enhanced for-loop is cleaner for read-only traversal. This approach runs in O(n) time and O(n) space due to the list storage, effectively handling the array sum requirement."
// Pitfalls    (1) Integer overflow may occur if the sum of array elements exceeds the maximum value of a 32-bit signed integer.  (2) The input parsing logic assumes the array elements are space-separated on a single line as specified in the input format.
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

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    int sum=0;
    for(int i:ar){
        sum+=i;
    }
return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-09, 12:32 a.m.
// Technique   static-initializer-block-exception-handling
// Time        O(1)
// Space       O(1)
// Insight     The static initializer block executes immediately upon class loading, allowing for input validation and exception handling before the main method runs.
// Interview   Before: "How do you handle initialization logic that might fail?" After: "I use a static block to read input and throw an exception if B or H are non-positive, ensuring O(1) validation before main executes."
// Pitfalls    (1) Failing to handle the exception inside the static block results in a NoClassDefFoundError.  (2) Assuming the static block runs after the main method instead of before it.  (3) Incorrectly using B <= 0 or H <= 0 as the condition for throwing the required exception.
// ──────────────────────────────────────────────────



   static boolean flag=false;
    static int B=1,H=3;
    
    static void f() 
    {
        if(B>=0&&H>=0){
            flag=true;
        }
    }
//Write your code here


static {
    f();
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    
}

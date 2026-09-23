// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
// Problem     Java Abstract Class
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-23, 11:56 p.m.
// Technique   concrete-class-inheritance
// Time        O(1)
// Space       O(1)
// Insight     The subclass MyBook provides a concrete implementation for the abstract setTitle method defined in the Book base class to assign a value to the inherited title field.
// Interview   Before: "How do I handle abstract methods in Java?" After: "You must provide a concrete implementation for every abstract method in the subclass. Here, MyBook overrides setTitle to set the title field, resulting in O(1) time and space complexity for the assignment operation."
// Pitfalls    (1) Failing to implement the abstract setTitle method causes a compilation error because the subclass remains abstract.  (2) Declaring the MyBook class as public violates the problem constraint requiring the class to be non-public.
// ──────────────────────────────────────────────────



class MyBook extends Book{
    void setTitle( String s){
        super.title=s;
    }
    
}
//Write MyBook class here


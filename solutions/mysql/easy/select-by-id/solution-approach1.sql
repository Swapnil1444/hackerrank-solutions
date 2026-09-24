-- ──────────────────────────────────────────────────
-- Link        https://www.hackerrank.com/challenges/select-by-id/problem?isFullScreen=true
-- Problem     Select By ID
-- Difficulty  Easy
-- Subdomain   Basic Select
-- Platform    HackerRank
-- Language    mysql
-- Status      Accepted
-- Submitted   2026-09-24, 11:59 a.m.
-- Technique   select-where-clause
-- Time        O(N)
-- Space       O(1)
-- Insight     The query retrieves all columns from the CITY table by filtering rows based on the equality of the ID column to the specified integer value.
-- Interview   Before: "How would you fetch a specific record by its primary key?" After: "I would use a SELECT statement with a WHERE clause to filter by the ID. This operation runs in O(N) time complexity, where N is the number of rows in the table, assuming no index exists on the ID column."
-- Pitfalls    (1) Failing to use the correct column name ID as specified in the schema.  (2) Incorrectly assuming the ID column is a string type when it is numeric, leading to potential type mismatch errors.
-- ──────────────────────────────────────────────────

SELECT * from CITY where ID=1661;

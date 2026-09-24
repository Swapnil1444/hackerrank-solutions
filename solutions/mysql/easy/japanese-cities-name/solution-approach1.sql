-- ──────────────────────────────────────────────────
-- Link        https://www.hackerrank.com/challenges/japanese-cities-name/problem?isFullScreen=true
-- Problem     Japanese Cities' Names
-- Difficulty  Easy
-- Subdomain   Basic Select
-- Platform    HackerRank
-- Language    mysql
-- Status      Accepted
-- Submitted   2026-09-24, 01:24 p.m.
-- Technique   simple-select-where-clause
-- Time        O(N)
-- Space       O(N)
-- Insight     The query filters the city table by matching the countrycode column against the literal string JPN to retrieve only the names of Japanese cities.
-- Interview   Before: "How would you extract specific records based on a categorical attribute?" After: "I would use a SELECT statement with a WHERE clause to filter rows. This operation runs in O(N) time, where N is the number of rows in the table, as it requires a full scan to identify all records where the countrycode is JPN."
-- Pitfalls    (1) Failing to use double quotes or single quotes for the string literal JPN will cause a syntax error.  (2) Assuming the column name is case-insensitive when the database collation might be case-sensitive.
-- ──────────────────────────────────────────────────

SELECT name FROM city where COUNTRYCODE ="JPN";

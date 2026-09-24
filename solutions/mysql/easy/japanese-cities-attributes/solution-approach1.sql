-- ──────────────────────────────────────────────────
-- Link        https://www.hackerrank.com/challenges/japanese-cities-attributes/problem?isFullScreen=true
-- Problem     Japanese Cities' Attributes
-- Difficulty  Easy
-- Subdomain   Basic Select
-- Platform    HackerRank
-- Language    mysql
-- Status      Accepted
-- Submitted   2026-09-24, 01:21 p.m.
-- Technique   select-all-with-filter
-- Time        O(N)
-- Space       O(N)
-- Insight     The query retrieves all columns for every record in the CITY table that matches the specified country code filter.
-- Interview   Before: "How do I extract specific rows based on a column value?" After: "Use the WHERE clause to filter by the COUNTRYCODE column. This operation runs in O(N) time, where N is the number of rows in the table, as it requires a full scan to identify all Japanese cities."
-- Pitfalls    (1) Failing to use the exact string literal JPN as specified in the problem requirements.  (2) Using incorrect case sensitivity if the database collation is case-sensitive.
-- ──────────────────────────────────────────────────

SELECT * from CITY where COUNTRYCODE ="JPN";

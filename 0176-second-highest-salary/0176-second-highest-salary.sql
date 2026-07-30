# Write your MySQL query statement below
SELECT
max(salary) as secondhighestsalary
FROM employee
where salary < (select max(salary) from employee);


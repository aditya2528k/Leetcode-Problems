# Write your MySQL query statement below
SELECT 
person.firstName,
person.lastname,
Address.city,
Address.state
FROM person
LEFT JOIN Address
ON person.personId = Address.personId;

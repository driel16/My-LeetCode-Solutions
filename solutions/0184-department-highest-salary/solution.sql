# Write your MySQL query statement below
SELECT d.name as Department,
e.name as Employee,
e.salary as Salary
FROM Employee e
LEFT JOIN Department d ON e.departmentId = d.id
where e.salary = (
    SELECT Max(salary)
    FROM Employee
    WHERE departmentId = e.departmentId
)

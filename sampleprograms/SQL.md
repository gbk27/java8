
1. Query to find missing number in ordered integers

create table sequence (
    id int not null primary key
);

insert into sequence(id) values
    (1), (2), (3), (4), (6), (7), (8), (9),
    (10), (15), (16), (17), (18), (19), (20);

select l.id + 1 as start
from sequence as l
  left outer join sequence as r on l.id + 1 = r.id
where r.id is null;

Result :
start
5
11
21

https://www.xaprb.com/blog/2005/12/06/find-missing-numbers-in-a-sequence-with-sql/


2.  sub-query vs corealted subquery


Technical difference between Normal Sub-query and Co-related sub-query are:

1. Looping: Co-related sub-query loop under main-query; whereas nested not; therefore co-related sub-query executes on each iteration of main query. Whereas in case of Nested-query; subquery executes first then outer query executes next. Hence, the maximum no. of executes are NXM for correlated subquery and N+M for subquery.

2. Dependency(Inner to Outer vs Outer to Inner): In the case of co-related subquery, inner query depends on outer query for processing whereas in normal sub-query, Outer query depends on inner query.

3.Performance: Using Co-related sub-query performance decreases, since, it performs NXM iterations instead of N+M iterations. ¨ Co-related Sub-query Execution.


SELECT id, first_name 
FROM student_details 
WHERE id IN (SELECT student_id
FROM student_subjects 
WHERE subject= 'Science'); 

SELECT Salary 
FROM Employee E1
WHERE N-1 = (SELECT COUNT(*)
             FROM Employee E2
             WHERE E1.salary <E2.Salary) 



3. nth highest salary :

// 1st option
SELECT sal FROM (
    SELECT sal, row_number() OVER (order by sal desc) AS rn FROM emp
)
WHERE rn = 3;

// 2nd option
SELECT * FROM Employee WHERE sal = 
         (
            SELECT MIN(sal) FROM Employee 
            WHERE  sal IN (
                                 SELECT DISTINCT TOP N
                                     sal FROM Employee 
                                         ORDER BY sal DESC
                             )
        )
        
        
       
       
 Test Queries : http://sqlfiddle.com/
        

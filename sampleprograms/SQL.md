
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


2.  inner query vs subquery (also corelated queries)
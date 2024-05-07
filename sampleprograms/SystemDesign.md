**System Design**

https://bytebytego.com/

https://www.tech-maze.info/



What is CAP theorem?
---------------------
CAP(Consistency-Availability-Partition Tolerance) theorem says that a distributed system cannot guarantee C, A and P simultaneously. It can at max provide any 2 of the 3 guarantees. Let us understand this with the help of a distributed database system.

* Consistency: This states that the data has to remain consistent after the execution of an operation in the database. For example, post database updation, all queries should retrieve the same result.
* Availability: The databases cannot have downtime and should be available and responsive always.
* Partition Tolerance: The database system should be functioning despite the communication becoming unstable.

  ![image](https://github.com/gbk27/java8/assets/42496600/9925343d-df72-4ead-90aa-6343b7d980d9)

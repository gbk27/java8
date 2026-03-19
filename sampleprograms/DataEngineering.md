

  Qn : Can you explain the design schemas relevant to data modeling?

There are three primary data modeling design schemas: star, snowflake, and galaxy.

Star schema: This schema contains various dimension tables connected to a central fact table. It is simple and easy to understand, making it suitable for straightforward queries.
Star Schema

Star schema example. 

<img width="528" height="459" alt="image" src="https://github.com/user-attachments/assets/5581201a-a77f-4e30-9c70-be5856443b09" />



Snowflake schema: An extension of the star schema, the snowflake schema consists of a fact table and multiple dimension tables with additional layers of normalization, forming a snowflake-like structure. It reduces redundancy and improves data integrity.


<img width="987" height="453" alt="image" src="https://github.com/user-attachments/assets/6c2f4475-884d-4abc-8fc2-3678c4ce5379" />


Snowflake schema example. Image from guru99

Galaxy schema: Also known as a fact constellation schema, it contains two or more fact tables that share dimension tables. This schema is suitable for complex database systems that require multiple fact tables.

<img width="813" height="373" alt="image" src="https://github.com/user-attachments/assets/5d0ff0dd-e699-4655-ac06-066f8b466ba3" />

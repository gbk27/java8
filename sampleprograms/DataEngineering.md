

Can you explain the design schemas relevant to data modeling?
------------------------------------------------------------------

There are three primary data modeling design schemas: star, snowflake, and galaxy.

Star schema: This schema contains various dimension tables connected to a central fact table. It is simple and easy to understand, making it suitable for straightforward queries.
Star Schema

Star schema example. 

<img width="528" height="459" alt="image" src="https://github.com/user-attachments/assets/5581201a-a77f-4e30-9c70-be5856443b09" />



Snowflake schema: An extension of the star schema, the snowflake schema consists of a fact table and multiple dimension tables with additional layers of normalization, forming a snowflake-like structure. It reduces redundancy and improves data integrity.


<img width="987" height="453" alt="image" src="https://github.com/user-attachments/assets/6c2f4475-884d-4abc-8fc2-3678c4ce5379" />



Galaxy schema: Also known as a fact constellation schema, it contains two or more fact tables that share dimension tables. This schema is suitable for complex database systems that require multiple fact tables.

<img width="813" height="373" alt="image" src="https://github.com/user-attachments/assets/5d0ff0dd-e699-4655-ac06-066f8b466ba3" />



Which Python libraries are most efficient for data processing?
--------------------------------------------------------------

The most popular data processing libraries in Python include:

pandas: Ideal for data manipulation and analysis, providing data structures like DataFrames.

NumPy: Essential for numerical computations, supporting large multi-dimensional arrays and matrices.

Dask: Facilitates parallel computing and can handle larger-than-memory computations using a familiar pandas-like syntax.

PySpark: A Python API for Apache Spark, useful for large-scale data processing and real-time analytics.


How do you handle large datasets in Python that do not fit into memory?
----------------------------------------------------------------------
Handling large datasets that do not fit into memory requires using tools and techniques designed for out-of-core computation:

* Dask: Allows for parallel computing and works with larger-than-memory datasets using a pandas-like syntax.
  import dask.dataframe as dd
  df = dd.read_csv('large_dataset.csv')

* PySpark: Enables distributed data processing, which is useful for handling large-scale data.
  from pyspark.sql import SparkSession
  spark = SparkSession.builder.appName('data_processing').getOrCreate()
  df = spark.read.csv('large_dataset.csv', header=True, inferSchema=True)

* Chunking with pandas: Read large datasets in chunks.
  import pandas as pd
  chunk_size = 10000
  for chunk in pd.read_csv('large_dataset.csv', chunksize=chunk_size):
      process(chunk)  # Replace with your processing function







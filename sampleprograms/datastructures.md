Big O Notation
--------------

* O(1) - Constant - return true
* O(log n) - logarithmic - binary search
* O(n) - linear - forloop
* O(n ^ 2) - Quadratic - loop within loop
* O(c ^ n) - exponential - recursive call over n and looping over c in function


Data Structure Characteristic 
------------------------------
- data to hold
- in/out
- ordered / sequenced
- performance


Stack - LIFO
------------
push - O(1)
pop - O(1)
contains - O(n)
access - O(n)


Queue - FIFO
------------
enQueue - O(1);
deQueue - O(1)
contains - O(n);
access - O(n);
size()

Ex: ArrayBlockingQueue, PriorityQueue, ConcurrentLinkedQueue etc...

List
----
add - O(1)
remove - O(1)
insert - O(n)
remove - O(n)
find - O(n)
get - O(n)

Reference:
----------
http://www.java2novice.com/data-structures-in-java/stacks/dynamic-stack/
https://howtodoinjava.com/data-structure/java-stack-implementation-array/




HashMap: (https://javabypatel.blogspot.com/2015/10/what-is-load-factor-and-rehashing-in-hashmap.html)
--------
Default load factor of Hashmap is 0.75f (i.e 75% of current map size). 
Default capacity of Hashmap is 2^4 = 16 buckets.

 So, when to increase the hashmap size is decided by product of,
    (initial capacity of hashmap * Load factor of hashmap).
    initial capacity of hashmap * Load factor of hashmap =  16 * 0.75 = 12. 

    HashMap m = new HashMap(int initialCapacity, float load Factor);
  
  Rehashing
  Rehashing is the process of re-calculating the hashcode of already stored entries (Key-Value pairs), to move them to another bigger size hashmap when Load factor threshold is reached.
  Rehashing is done to distribute items across the new length hashmap, so that get and put operation time complexity remains O(1).












The backbone of java concurrency are threads. 
A thread is a lightweight process which has its own call stack, but can access shared data of other threads in the same process. 
A Java application runs by default in one process. Within a Java application you can work with many threads to achieve parallel processing or concurrency


JDK 1.x

    java.lang.Thread
    java.lang.ThreadGroup
    java.lang.Runnable
    java.lang.Process
    java.lang.ThreadDeath
    and some exception classes

e.g.

    java.lang.IllegalMonitorStateException
    java.lang.IllegalStateException
    java.lang.IllegalThreadStateException.

JDK 1.5 was first big release after JDK 1.x; and it had included multiple concurrency utilities. Executor, semaphore, mutex, barrier, latches, concurrent collections and blocking queues; all were included in this release itself.

JDK 1.7 added support for ForkJoinPool which implemented work-stealing technique to maximize the throughput. Also Phaser class was added.

JDK 1.8 is largely known for Lambda changes, but it also had few concurrency changes as well. Two new interfaces and four new classes were added in java.util.concurrent package e.g. CompletableFuture and CompletionException.

Thread-Safety
 - 
 a class is thread-safe when it continues to behave correctly when accessed from multiple threads.

Concurrency vs. Parallelism
 - 
 Parallelism requires hardware with multiple processing units, essentially. In single core CPU, you may get concurrency but NOT parallelism.
 
 
Java Compare and Swap Example – CAS Algorithm
 - 
Traditional locking mechanisms, e.g. using synchronized keyword in java, is said to be pessimistic technique of locking or multi-threading

There are 3 parameters for a CAS operation: optimistic in nature

    A memory location V where value has to be replaced
    Old value A which was read by thread last time
    New value B which should be written over V
    
 1) Thread 1 and 2 want to increment it, they both read the value and increment it to 11.
 
 V = 10, A = 0, B = 0
 
 2) Now thread 1 comes first and compare V with it’s last read value:
 
 V = 10, A = 10, B = 11
 
 if     A = V
    V = B
  else
    operation failed
    return V
 
 Clearly the value of V will be overwritten as 11, i.e. operation was successful.
 
 3) Thread 2 comes and try the same operation as thread 1
 
 V = 11, A = 10, B = 11
 
 if     A = V
    V = B
  else
    operation failed
    return V
 
 4) In this case, V is not equal to A, so value is not replaced and current value of V i.e. 11 is returned. Now thread 2, again retry this operation with values:
 
 V = 11, A = 11, B = 12
 
 And this time, condition is met and incremented value 12 is returned to thread 2.
 
 In summary, when multiple threads attempt to update the same variable simultaneously using CAS, one wins and updates the variable’s value, and the rest lose. But the losers are not punished by suspension of thread. They are free to retry the operation or simply do nothing.
 
 
Synchronized 
- 

 In case of synchronized method, the lock object is –

    ‘.class’ object – if the method is static.
    ‘this’ object – if the method is not static. ‘this’ refer to reference to current object in which synchronized method is invoked.
Java synchronized keyword is re-entrant in nature it means if a synchronized method calls another synchronized method which requires same lock then current thread which is holding lock can enter into that method without acquiring lock.

Semaphore
- 
You can visualize a semaphore as counter which can be incremented or decremented

Talking in terms of multi-threading, when a thread wants to access one of shared resources (guarded by semaphore), first, it must acquire the semaphore. 
If the internal counter of the semaphore is greater than 0, the semaphore decrements the counter and allows access to the shared resource. Otherwise, if the counter of the semaphore is 0, the semaphore puts the thread to sleep until the counter is greater than 0.
A value of 0 in the counter means all the shared resources are used by other threads, so the thread that wants to use one of them must wait until one is free.

CountDownLatch
-
As per java docs, CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of operations being performed in other threads completes.

This class enables a java thread to wait until other set of threads completes their tasks. e.g. Application’s main thread want to wait, till other service threads which are responsible for starting framework services have completed started all services.

ForkJoinPool
-
Basically the Fork-Join breaks the task at hand into mini-tasks until the mini-task is simple enough that it can be solved without further breakups. 
It’s like a divide-and-conquer algorithm. One important concept to note in this framework is that ideally no worker thread is idle. 
They implement a work-stealing algorithm in that idle workers steal the work from those workers who are busy.


Ref :
- 
https://howtodoinjava.com/java-concurrency-tutorial/
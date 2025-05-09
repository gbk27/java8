
* Is Python a compiled language or an interpreted language?

  Compilation: When you write Python code and run it, the source code (.py files) is first compiled into an intermediate form called bytecode (.pyc files). This bytecode is a lower-level representation of your code, but it is still not directly machine code. It’s something that the Python Virtual Machine (PVM) can understand and execute.

  Interpretation: After Python code is compiled into bytecode, it is executed by the Python Virtual Machine (PVM), which is an interpreter. The PVM reads the bytecode and executes it line-by-line at runtime, which is why Python is considered an interpreted language in practice.

 * What is a lambda function?
  
    A lambda function is an anonymous function. This function can have any number of parameters but, can have just one statement.

    In the example, we defined a lambda function(upper) to convert a string to its upper case using upper().

        s1 = 'GeeksforGeeks'
        s2 = lambda func: func.upper()
        print(s2(s1))


* Differentiate between List and Tuple?
      Let’s analyze the differences between List and Tuple:

    **List**

        Lists are Mutable datatype
        Lists consume more memory
        The list is better for performing operations, such as insertion and deletion.
       The implication of iterations is Time-consuming
   
     **Tuple**

        Tuples are Immutable datatype.
        Tuple consumes less memory as compared to the list
        A Tuple data type is appropriate for accessing the elements
        The implication of iterations is comparatively Faster

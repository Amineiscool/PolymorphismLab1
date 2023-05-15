notes on Stack and Heap from the Headfirst Java text book. 

The Stack is a region of memory that is used to store local variables and method calls. Each time a method is called, a new frame is added to the top of the stack to hold the local variables and other information for that method. 

The Heap is a region of memory that is used to store objects. When an object is created, memory is allocated on the heap to hold the object's data. 

Variables that are created inside a method are stored on the stack and are destroyed when the method returns. Objects created in a method are also initially stored on the stack, but the object's data is stored on the heap. When the method returns, the object's reference variable is destroyed, but the object itself remains on the heap until it is no longer referenced by any other variables. If a variable is declared outside of a method , it is stored on the heap and is not destroyed until the object that contains it is destroyed.

The Stack is a limited resource, so if you have too many method calls or too many local variables, you can run out of stack space and get a StackOverflowError. 

The Heap, on the other hand, is much larger than the Stack and can store a lot more data. However, if you create too many objects or if your objects are too large, you can run out of heap space and get an OutOfMemoryError. 

Garbage collection is the process of reclaiming memory that is no longer being used by an application. When an object is no longer referenced by any variables, it is considered garbage and can be collected by the garbage collector. The garbage collector runs periodically in the background, looking for unused objects and reclaiming their memory. However, it is not guaranteed to run at any specific time, so you should not rely on it to clean up your memory for you.
 
 



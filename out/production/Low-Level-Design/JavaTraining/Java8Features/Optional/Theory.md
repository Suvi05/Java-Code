Null Pointer Exceptions can crash the application, if they are not checked and handled properly.

To overcome this "Null Pointer Exception", JAVA 8 came with **Optional Class**.

Optional is a container class, that can have "VALUE" when data is available,
and if there is no data instead of a "Null", optional container will be empty.

So instead of filling our code with a lots of "Null checks", we can use Optional
object which will be "EMPTY" if data is not there.

If data is present then we will take that "value" or if it is empty we will take some
other action.
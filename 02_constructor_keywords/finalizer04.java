/*garbage collector 
in java we cannot control when the garbage collector runs
means we cannot do manual cleanup 
so some special methods are provided to perform cleanup operations 
*/

/*finalize() method is used to perform cleanup operations before an object is destroyed by the garbage collector.
The finalize() method is called by the garbage collector when it determines that there are no more references to the object.
The finalize() method is defined in the Object class and can be overridden by a class to provide custom cleanup operations.
The finalize() method is called by the garbage collector before the object is destroyed, so it can be used to release resources or perform other cleanup operations.*/

//example of finalize() method simple
public class finalizer04{
    public static void main(String[] args) {

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
        // kunal = new A("new object");

        A obj;

        // Creating many objects so memory fills up and Garbage Collector runs automatically
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");
        }
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
  
/*final keyword is used to make a variable constant. 
Once a variable is declared as final, its value cannot be changed.*/
public class final03 {
    public static void main(String[] args) {
        final int a = 20;
        //a = 30; // This will cause a compile-time error because a is declared as final
        System.out.println(a);

        final A obj = new A();

        //obj = new A(); // This will cause a compile-time error because obj is declared as final and we cannot change the reference of a final variable
        //obj = new A(); // This will cause a compile-time error because obj is declared as final and we cannot change the reference of a final variable
        //obj.num = 30; // This will cause a compile-time error because num is declared as final and we cannot change the value of a final variable
        System.out.println(obj.num); // This will print 10 because num is declared as final and we cannot change the value of a final variable
    }

    static class A{
       // final int num; in final variable must be initialized at the time of declaration or in the constructor. So we cannot declare a final variable without initializing it.
        final int num = 10; // final variable must be initialized at the time of declaration or in the constructor. So we cannot declare a final variable without initializing it.
        A(){
            
            //num = 20; // This will cause a compile-time error because num is declared as final and it is already initialized at the time of declaration
        }
    }

    /*if we use final keyword in primitive data type, then we cannot change the value of that variable.
     But if we use final keyword in reference data type, then we can change the value of that variable but we cannot change the reference of that variable.*/
}
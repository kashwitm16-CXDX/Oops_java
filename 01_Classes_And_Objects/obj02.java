/*let us consider a class called Student which has the following attributes: name, age, and grade. 
with the help of class or the template given we create student1("John", 15, "10th") and student2("Alice", 14, "9th"). 
now the thing is how can we create that student object? from class Student
and access its attributes? */

/* To create a student object from the class Student and access its attributes, you can follow these steps:
with help of dot operator we can access the attributes of the object. Here is an example implementation in java
where the dot operator linkes the object to its attributes. 
ex student1.name; // which will return the name of student1 that is "John"
variables inside the object are called instance variables. */

import java.util.Arrays;
class obj02 {
public static void main(String[] args) {

    

    //to store 5 students data which includes roll number ,marks and name of students
    Student[] student = new Student[5]; // this will create an array of 5 Student objects

    //Student kashwi; //(declaration like reference to Student it does not create an object) 
    //System.out.println(kashwi.name); // this will return an error because the variable kashwi is not initialized yet.*/

    //to create an object we use new keyword followed by the class name and parentheses.
    Student kashwi = new Student();
     /* this will create an object of Student class named kashwi and initialize it with default values.
    here left part is in compiler time and right part is in runtime. left part is reference variable and right part is object.
    //where as kashwi is an reference variable which is used to access the object and its attributes.*/

    /*new keyword will allocate memory in runtime and return the address of the object which is stored in the reference variable kashwi.
    all class and objects in java are dynamically allocated in heap memory.
    
    in java primitive data types are stored in stack memory and objects are stored in heap memory.*/

    //System.out.println(kashwi.name); // this will return null because the object kashwi is initialized with default values.
    //System.out.println(Arrays.toString(student)); // this will return [null, null, null, null, null] because the array student is initialized with default values.

   // System.out.println(kashwi); // this will return the address of the object kashwi in heap memory. for example Student@15db9742 where Student is the class name and @15db9742 is the address of the object in heap memory.(random value)
   // System.out.println(kashwi.roll_number); // by default the value of roll_number is 0 because it is an integer and the default value of integer is 0.
    //System.out.println(kashwi.name); // by default the value of name is null because it is a string and the default value of string is null.
   // System.out.println(kashwi.marks); // by default the value of marks is 0.0 because it is a float and the default value of float is 0.0.

   kashwi.roll_number = 1; // this will set the value of roll_number to 1.
   kashwi.name = "Kashwi"; // this will set the value of name to "Kashwi".
   kashwi.marks = 95.5f; // this will set the value of marks to 95.5.

    System.out.println(kashwi.roll_number); // this will return 1.
    System.out.println(kashwi.name); // this will return "Kashwi".
    System.out.println(kashwi.marks); // this will return 95.5.

    /*if marks was not given values then in class marks = 90f is given then the value of marks will be 90f because it is initialized with a value in the class.

    //kashwi.salary = 10000; // this will return an error because the variable salary is not defined in the class Student.
    where java is static ,but in python you can d0 it*/
}
}

    class Student{
        int roll_number;    
        String name;
        float marks;
    }

/*after all these we think ok teacher just gave us only 3 properties 
so thats fine writing kashwi.roll_number = 1; kashwi.name = "Kashwi"; kashwi.marks = 95.5f; is fine
 but what if teacher gave us 10 properties then we have to write 10 lines of code to initialize the object which is not good.

 so to solve this problem we can use constructor which is a special method which is used to initialize the object.
constructor has the same name as the class and does not have a return type.
*/


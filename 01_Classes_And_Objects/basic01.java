/* before knowing what classes and objects are, let's first understand what a class is. A class is a blueprint for creating objects. It defines a set of attributes and methods that the created objects will have.*/
/*lets take a scenario where a teacher wants to data types for building applications */
/* so teacher first says create datatypes to store roll number of  5 students
so what we do ,we know that roll number is a number so we can use int datatype to store roll number of students
 int[] roll_number = new int[5]; // this will create an array of 5 integers to store roll numbers of students
*/

/* now teacher says create datatypes to store names of 5 students
so what we do ,we know that name is a string so we can use string datatype to store names of students
 string[] names = new string[5]; // this will create an array of 5 strings
 */

 /*now teacher says create datatype to store 5 students data which includes roll number ,marks and name of students
 so we get confusion here because we have 3 different datatypes to store 3 different data types of students
 simply we write int[] roll_number = new int[5];
 String[] names = new string[5];
 float[] marks = new float[5];

 teacher says fine but you have create different datatypes for different parameters of students 
 i want it in one datatype so that i can store all the data of students in one place
 so these is where classes come into play
*/

/* so creating of our own datatype is called class 
class name should be in capital letter and should be singular
Student[] student = new Student[5]; // this will create an array of 5 Student objects
student kashwi; // this will create an object of Student class named kashwi

//creating a class named Student
class Student{
    int roll_number;
    String name;
    float marks;
}

*/

//class is named group of properties and methods which are used to create objects

/*lets take some real world example of car

to create a car we now the basic needs thas is like some template of car which is used to create a car
where template consists of seat, engine, price

by keeping the same template we create different brand of car like toyota, honda, audi, bmw etc
let us consider maruti seat =4,engine=petrol,price=1000000
                tata seat =2,engine=diesel,price=800000
                audi seat =4,engine=electric,price=2000000

    same properties but different values so we can say that these are different objects of same class

*/

/*where class is a templete which is used to create objects and object is an instance of class
class = logical entity which is used to create objects
object = physical entity which is created using class
*/

/* objects have three characteristics
1. state : attributes of object
2. behavior : methods of object
3. identity : unique name of object
*/


public class basic01 {
public static void main(String[] args) {

    //to store roll number of 5 students
    int[] roll_number = new int[5]; // this will create an array of 5 integers to store roll numbers of students

    //to store names of 5 students
    String[] names = new String[5]; // this will create an array of 5 strings to store names of students    

    //to store marks of 5 students
    float[] marks = new float[5]; // this will create an array of 5

    //to store 5 students data which includes roll number ,marks and name of students
    Student[] student = new Student[5]; // this will create an array of 5 Student objects
    student kashwi; // this will create an object of Student class named kashwi
}

    class Student{
        int roll_number;    
        String name;
        float marks;
    }

}


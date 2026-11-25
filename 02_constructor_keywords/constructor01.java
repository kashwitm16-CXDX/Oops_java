/*constructor is a special method that is automatically called when an object of a class is created */

public class constructor01 {
public static void main(String[] args) {

    Student s1 = new Student(101);
    Student s2 = new Student(102, "Alice", 90.0f);
    //Student s3 = new Student(103, "Bob"); this will give an error because we have not defined a constructor with 2 parameters. So we need to define a constructor with 2 parameters if we want to create an object with 2 parameters.
    Student s3 = new Student(); 

    /*S1.roll_number = 101;
    S1.name = "John";
    S1.marks = 85.5f;*/ //we need to write like these without a constructor but it is not a good practice to write like this because we have to write the same code again and again for every object we create. So we use constructor to initialize the values of the object.

    System.out.println(s1.roll_number + " " + s1.name + " " + s1.marks);
    System.out.println(s2.roll_number + " " + s2.name + " " + s2.marks);
    System.out.println(s3.roll_number + " " + s3.name + " " + s3.marks);
    s1.changeName("Mike");
    s1.greetings();
}
}

    class Student{
        int roll_number;    
        String name;
        float marks;

        void greetings(){
            System.out.println("Hello" + this.name);
        }

        void changeName(String newname){
           // name = newname; println("Name changed from " + this.name + " to " + newname);
            this.name = newname;    
        }

        Student(int roll_number){ //constructor
           /* s1.roll_number = 101;
            s1.name = "John";
            s1.marks = 85.5f;*/ //we can not do only for s1 object becauce its just a template for all the objects of the class. So we can not use s1 in constructor. We can use this keyword to refer to the current object.
            this.roll_number = roll_number;
            this.name = "John";
            this.marks = 85.5f;

        }


        Student(int roll_number, String name, float marks){ //parameterized constructor
            /*roll_number = roll_number;
            name = name;
            marks = marks;*/ //this will not work because the local variable roll_number is shadowing the instance variable roll_number. So we need to use this keyword to refer to the instance variable.
            this.roll_number = roll_number; 
            this.name = name;
            this.marks = marks;

        }

        /*this keyword is also used in calling constructor to another constructor. This is called constructor chaining.
         We can use this() to call another constructor of the same class. We can not use this() to call a constructor of another class. 
         We can only use this() to call a constructor of the same class. We can not use this() to call a constructor of the superclass.
          We can only use super() to call a constructor of the superclass.*/

          Student(){
            this(103, "John", 85.5f); //this will call the parameterized constructor with 3 parameters. This is called constructor chaining.
          }
    }

/* while creating a primitive data type we dont use new keyword but when we create an object of a class we use new keyword.
 The new keyword is used to create an object of a class.
  The new keyword allocates memory for the object and returns a reference to the object. 
  The reference is stored in the variable s1, s2, s3.
   The reference is used to access the members of the class.
    The reference is also called as object reference. The reference is also called as object handle. The reference is also called as object pointer. The reference is also called as object address. The reference is also called as object instance. The reference is also called as object variable. The reference is also called as object identifier. The reference is also called as object name. The reference is also called as object label. The reference is also called as object tag. The reference is also called as object key. The reference is also called as object token. The reference is also called as object symbol. The reference is also called as object mark. The reference is also called as object sign. The reference is also called as object signal. The reference is also called as object indicator.
     The reference is also called as object pointer variable.
*/

/*conclusion : constructor is a special method that is automatically called when an object of a class is created. 
It is used to initialize the values of the object.
 It has the same name as the class and does not have a return type.
  It can be overloaded. It can be parameterized. 
  It can be called using this() keyword.
   */
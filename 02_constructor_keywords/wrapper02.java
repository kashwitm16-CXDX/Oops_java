/*wrapper is a class which is used to convert primitive data types into objects. 
 * It is also known as boxing.
 * 
 * There are 8 wrapper classes in java. They are:
 * 1. Byte
 * 2. Short
 * 3. Integer
 * 4. Long
 * 5. Float
 * 6. Double
 * 7. Character
 * 8. Boolean
 */

public class wrapper02 {
    public static void main(String[] args) {
        
        /*int a = 20;
        int b = 30;*/
        //Integer i = Integer.valueOf(a); // converting int into Integer explicitly
        //Integer j = a; // autoboxing, now compiler will write Integer.valueOf(a) internally

        /*swap(a, b);
        System.out.println(a + " " + b); // a and b will not be swapped because java is pass by value. So we need to use wrapper class to swap the values of a and b.*/

        Integer i = 20; // autoboxing, now compiler will write Integer.valueOf(a) internally
        Integer j = 30; // autoboxing, now compiler will write Integer.valueOf(a) internally

        swap(i, j);
        System.out.println(i + " " + j); // i and j will be swapped because Integer is a wrapper class and it is passed by reference. So we can swap the values of i and j.

        
    }
        /*static void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;
        }*/

         static void swap(Integer a, Integer b){
            Integer temp = a;
            a = b;
            b = temp;
        }
        /*swapping cannot be done in both the cases because INteger is immutable class. So we cannot change the value of Integer object. We can only change the reference of Integer object. So we cannot swap the values of a and b in both the cases.*/
    }

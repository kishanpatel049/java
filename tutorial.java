import java.util.*;
import java.awt.*; // pointer class
/*
  tutorilail hva vedio
*/

// hello world
class Main {

    public static void main(String[] args) {
      
      //data type
      int myAge = 22;
      long viewCount = 3_123_456_780L;
      float price = 1.99F;
      char latter = 'Y';
      boolean lightState = true;
      
     
      /*
      datatypr: byte, short,int,long, float, double, char, boolen 
      */
       
      //class instace
      String myName = "Kishan";
      Date now = new Date();
      System.out.println(now);
      
      //print statement
      System.out.print("Hello, World! "); 
      System.out.println("My Age "+ myAge);
      System.out.println("My Name is "+ myName);
      
      //pointers 
      byte a = 1;
      byte b = a;
      a = 2;
      System.out.println(a);
      /*
      Point point1 = new Point(x, y);  // 41.36
      Point point2 = point1;
      point1.x = 2;
      System.out.println(point2);
      */
    
      //strings
      /*
       method list
       .endWith()
       .length()
       .indexOf()
       .replace()

      */
      System.out.println(myName.replace('h', 's'));

    }
}



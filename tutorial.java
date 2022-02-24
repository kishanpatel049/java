import java.util.*;
/*
  tutorilail hva vedio
*/
class Pointer<T>{
  // An object of type T is declared
  T obj;

  //compiles
 Pointer(T obj) {
     this.obj = obj;
  }

  public void setObject( T val) {
      this.obj = val;
  }

  public T getObject() {
     return this.obj;
 }
}
// vedio totorial 
class Main {

    public static void main(String[] args) {
      
      //data type
      int myAge = 22;
      long viewCount = 3_123_456_780L;
      float price = 1.99F;
      char latter = 'Y';
      boolean lightState = true;
      
      //constant
      final float PI = 3.14F;
     
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
      int a = 1;
      int b = a;
      a = 2;
      System.out.println(b);
      Pointer<Integer> x = new Pointer<Integer>(1);
      Pointer<Integer> y = x;
      x.setObject(2);
      System.out.println(y.getObject());
    

        
      //strings
      /*
       method list
       .endWith()
       .length()
       .indexOf()
       .replace()
       .toLowerCase()
       .toUpperCase()
       .trim()                     // remove whight space form string
       )
      */

      /* ---> \\, \", \', \t, \n <--- */
      System.out.println(myName.replace('h', 's'));
      System.out.println(myName);



      //arrays
      int[] intArray = new int[5];  //5 is size of array
      intArray[0] = 2;
      intArray[1] = 1;
      int[] intArray2 = {-1,-2,-3,-4}; 
      System.out.println(intArray);   
      Arrays.sort(intArray);                            //sort
      System.out.println( Arrays.toString(intArray));   //print array
      System.out.println(intArray2.length);             //lengtg

      //multi dimenstiona arrays 
      int[][][] setOfCube = new int[5][4][3];
      System.out.println(Arrays.deepToString(setOfCube));  //print multidimensional array



      //arathmatic expression 
      /*    *, \, -, +, %      */
      int number = (10-2)*(1 - 9 * 8 / 2 % 3 + 5);
      System.out.println(number);
     /*     +=, -=, *=,...     */ 
     a = 1;
     b = ++a;
     System.out.println(a + " " + b);

     a = 1;
     b = a++;
     System.out.println(a + " " + b);
      

     //math class 
     /*
       method list
       Math.round();
       Math.ceil()
       Math.floor()
       Math.max( , )     
       Math.min( , ) 
       Math.random( )                 
       )
      */

    //casting
    //implisit casting vs expletic casting  
    
    double c = 1.1;
    int d = (int)c + 2;
    /* to convert  to strig
    Integer.parseInt("1");
    Short.parseShort("1");
    Float.parseFloat("1");
    ...
    */ 
    
    //formaiong numbers 1.19minuts 


    }
}



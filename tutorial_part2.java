public class tutorial_part2 {
    public static void main(String[] args) {
        
        // cpmperision operators 1h 39m
        /* and &&, or||, termery operator */
        int x = 1, y = 2, z=3;
        y = (x == 20) ? 61: 90;  // termery operator if x==20, y =61, else y=90
        System.out.println(x>y && x>z || y<z);  
        System.out.println((x<z || y>z) && x<y);  

        // if else statement
        int a = 20;
 
        if (a == 10){
            System.out.println("i is 10");
            // requires prethesis if more then one line or perenthesis not 
        }else if (a == 15)
            System.out.println("i is 15");
        else if (a == 20)
            System.out.println("i is 20");
        else{
            System.out.println("i is not present");
        }


        // loops
        /* for, while, do while, case loop */

        //for each
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }

        //v.2
          String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
          for (String i : cars) {
            System.out.println(i);
          }

        //while
        a = 0;
        while (a < 5) {
          System.out.println(a);
          a++;
        }

        //do while
        a = 0;
        do {
          System.out.println(a);
          a++;
        }
        while (a < 5);

        //case statement
        int day = 4;
        switch (day) {
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
          }




            




    }
}

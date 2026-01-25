

import java.util.Scanner;

public class Conditionals {
  public static void main(String[] args) {
      /*
          syntax of for loops:
          for(initiliasation; condition; increament/decreament){
                //body
          }
      */
      // Q: Print numbers from 1 to 5
//      for(int number = 1; number<=5;number += 1){
//        System.out.println(number);
//      }
      
      //Print numbers from 1 to n
/*     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for(int num = 1;num<=5;num++){ 
       System.out.print(num + " ");
        System.out.println("Hello World");
          System.out.println("Square of " + num + " is " + (num * num));
      }
*/
      // While loops

      /*
        while (condition){
            body
        }
      */
/*       int num = 1;
      while(num <= 5){
        System.out.println(num);
        num+=1;
      }
*/

      /*
       do whilel loop synatax:
       do{
       }while(condition);
       */

      int n = 1;
      do{
        System.out.println("Hello World");
      }while(n != 1);

  }
}
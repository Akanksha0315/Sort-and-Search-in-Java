//Program to perform Linear Search
import java.io.*;
class LinearSearch
{
   public static void main(String args[])throws IOException
   {
      int num = 0, pos = 0, flag = 0;
      //initializing variable
      int A[] = new int [10];
      //initializing a single dimensional array
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter 10 numbers");
      for(int i = 0; i < 10; i++)
      {
         A[i] = Integer.parseInt(br.readLine());
       }//end of for loop
      //taking input from user
      System.out.println(" ");
      System.out.println("Enter a number to check if it is present in the array");
      num = Integer.parseInt(br.readLine());
      //taking input from user
      for(int i = 0; i < 10; i++)
      {
         if(A[i] == num)
         {
            flag = 1;
            pos = i + 1;
            break;
          }
       }
      System.out.println(" "); 
      if(flag == 1)
      {
         System.out.println("The number " + num + " has been found at position " + pos);  
       }
      else
      {
         System.out.println("Sorry! The number has NOT been found");   
        }       
      System.out.println(" ");  
    }//end of main
 }//end of class
/**VDT
  Variable   Datatype        Description
    a[]        int        to store multiple                
    t          int        temporary variable      
    i          int    control variable to run loop
    j          int    control variable to run loop
 */

//incompete
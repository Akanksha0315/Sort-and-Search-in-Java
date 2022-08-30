//Program to perform Selection Sort 
import java.io.*;
class SelectionSort
{
   public static void main (String args[]) throws IOException
   {
      int temp = 0, pos = 0;    
      //initializing variables
      int A[] = new int [10];
      //initializing one dimensional array
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr); 
      System.out.println("Enter 10 numbers");
      for(int i = 0; i < 10; i++)
      {
         A[i] = Integer.parseInt(br.readLine());
       }//end of for loop
      //taking input from user
      System.out.println(" ");
      System.out.println("The elements arranged in ascending order are as follows:");
      for(int i = 0; i < 10; i++)//performing Selection Sort
      {
         temp = A[i];
         pos = i;
         for(int j = (i+1); j < 10; j++)
         {
            if(temp > A[j])
            {
               temp = A[j];
               pos = j;
             }//end of if statement
          }//end of for loop
         temp = A[i];
         A[i] = A[pos];
         A[pos] = temp;
         //arranging elements in ascending order
       }//end of for loop
      for (int i = 0; i < 10; i++)//displaying the sorted array
      {
         System.out.println(A[i]);
       }//end of for loop
      System.out.println(" "); 
    }//end of main
 }//end of class
/**VDT
   Variable        Datatype             Description
      A[]            int          to store multiple values                  
     temp            int            temporary variable    
      pos            int             to store a value        
      i              int        control variable to run loop           
      j              int        control variable to run loop 
 */
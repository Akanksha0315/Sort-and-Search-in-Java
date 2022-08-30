//Program to perform Binary Search
import java.io.*; 
class BinarySearch 
{
   public static void main (String args []) throws IOException 
   {
      int num = 0, lower = 0, upper = 9, mid = 0, temp = 0, flag = 0; 
      int A[] = new int [10];
      InputStreamReader isr = new InputStreamReader (System.in) ;
      BufferedReader br = new BufferedReader (isr) ;
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
      System.out.println(" ");
      System.out.println("Arranging the array in ascending order to perform Binary Search");
      for(int i = 0; i < 10; i++) //performing Bubble Sort
      {
         for(int j = 0; j < 9; j++)
         {
            if(A[j] > A[j+1]) //swapping values to sort
            {
               temp = A[j];
               A[j] = A[j+1];
               A[j+1] = temp;
             }//end of if statement
          }//end of for loop
       }//end of for loop       
      for(int i = 0; i < 10; i++)//displaying the sorted array
      {
          System.out.println(A[i]);
       }//end of for loop
      System.out.println(" "); 
      while ( lower <= upper ) 
      {
           mid = ( upper + lower) / 2 ; 
           if ( num < A[mid] )
           {
               upper = mid - 1; 
           }//end of if 
           else if ( num > A[mid]) 
           { 
               lower = mid + 1; 
           }//end of else if 
           else 
           {
               flag = 1; 
               break ; 
           }//end of else 
       } //end of while 
      if ( flag == 1)
       {
           System.out.println ("The number " + A[mid] + " has been found "); 
       }//end of if 
       else 
       {
           System.out.println ("Sorry! The number has NOT been found"); 
       }//end of else
      System.out.println(" "); 
   }//end of main 
}//end of class 
/**VDT
 Variable        Datatype             Description
    A[]            int            to store multiple values                  
    num            int            to store a value    
    lower          int            to store a value  
    upper          int            to store a value   
    mid            int            to store a value 
    flag           int            to store a value 

*/

//let user input the numbers and size is 10
/*
 * Program to perform bubble sort on an one dimensional array
 */

import java.io.*; //importing io package
public class BubbleSort//start of class
{
    public static void main(String args[])throws IOException //start of main
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: "); 
        //storing size of the array
        int n=Integer.parseInt(br.readLine()); 

        int temp; //declaring variables
        int A[] = new int[n]; //declaring integer array

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)//inputting array elements
        {
            A[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Unsorted array: ");
        for(int i=0;i<n;i++)//printing the unsorted array
        {
            System.out.print(A[i]+ " ");
        }
        System.out.println();
        
        //Sorting the array using bubble sort
        for(int i=0; i<(n-1); i++) 
        {
            for(int j=i+1; j<n; j++)
            {
                if(A[i] > A[j]) //arranging array elements in ascending order
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array:");
        for(int i=0; i<n; i++) //printing the sorted array
        {
            System.out.print(A[i]+ "  ");
        }
        System.out.println();
    }//end of main
}//end of class

/*
 *           Variable Description Table
 * 
 * S.No.    Variable Name        Data Type              Description
 *  1             n                 int         stores no. of array elements
 *  2            A[]                int         stores integer array
 *  3           temp                int         Helps with swapping elements
 *  4             i                 int         loop control variable
 *  5             j                 int         loop control variable
 *  
 */
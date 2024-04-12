import java.util.Scanner;

public class Q1java
{ 
  
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        System.out.println("\n\nReversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.print(b[k]+" "); 
        } 
    } 
  
    public static void main(String[] args) 
    {   System.out.print("Enter no of terms: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n]; 
        
        for (int i=0;i<n;i++)
        {
            System.out.print("\nEnter n number :");
            arr[i]=sc.nextInt();
        }



        System.out.println("\nInitial array is: \n"); 
        for (int k = 0; k < arr.length; k++) { 
            System.out.print(arr[k]+" "); 
        } 
        // System.out.println();
        reverse(arr, arr.length); 
    } 
}
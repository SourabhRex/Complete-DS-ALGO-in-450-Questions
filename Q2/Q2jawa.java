import java.util.Scanner;

public class Q2jawa {

    public static void maxmin(int arr[],int n) {

        int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        if (mn>arr[i])
            mn=arr[i];
        if(mx<arr[i])
            mx=arr[i];
    }
    System.out.println("min= "+mn+"\nmax= "+mx);
    }


    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter no of terms: ");
        n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+"th element: ");
            arr[i]=sc.nextInt();
        }
        maxmin(arr,n);
        sc.close();

        
    }

    
    
}

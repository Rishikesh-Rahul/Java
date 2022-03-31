import java.util.Scanner;
public class Insertion_Sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        System.out.println("Enter the array elements");
        for(int i=0;i<8;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for(int i=0;i<8;i++)
        {
            System.out.println(a[i]);
        }


    
        for(int i=1;i<8;i++)
        {
            int cur=a[i];
            int j=i-1;
            while(j>=0 && a[j]>cur)
            {
               a[j+1]=a[j];
               j--;
            }
            a[j+1]=cur;
        }
        System.out.println("Sorted array is : ");
        for(int i=0;i<8;i++)
        {
            System.out.println(a[i]);
        }
    }    
}

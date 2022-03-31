import java.util.Scanner;
public class Bubble_Sort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        System.out.println("Enter the array elements :");
        for(int i=0;i<8;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered array elements is :");
        for(int i=0;i<8;i++)
        {
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<8;i++)
        {
            for(int j=i+1;j<8;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array is :");
        for(int i=0;i<8;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }    
}

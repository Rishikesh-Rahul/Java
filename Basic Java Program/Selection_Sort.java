import java.util.Scanner;
public class Selection_Sort 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        int min=0;
        System.out.println("Enter the array element");
        for(int i=0;i<8;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered array elements are :");
        for(int i=0;i<8;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<8-1;i++)
        {
            min=i;
            for(int j=i+1;j<8;j++)
            {
                if(a[min]>a[j])
                    min=j;
            }
            
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;

        }
        System.out.println("Sorted array is :");
        for(int i=0;i<8;i++)
        {
            System.out.println(a[i]);
        }
    }    
}

import java.util.Scanner;
import java.util.Arrays;
public class Binary_Search 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[]={5,3,6,9,10,44,94,84};
        Arrays.sort(a);
        System.out.println("Enter the element to be search");
        int x=sc.nextInt();
        int l=a.length;
        int low=0,high=l-1,mid=0;
        int flag=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(x<a[mid])
                high=mid-1;
            else if(x>a[mid])
                low=mid+1;
            else if(x==a[mid])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("The element "+x+" is found");
        else
            System.out.println("The element is not present in the array");
        sc.close();
    }    
}

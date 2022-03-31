import java.util.Scanner;
public class Linear_Search 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]={5,3,6,9,10,44,94,84};
        System.out.println("Enter the elements to be search : ");
        int x=sc.nextInt();
        int l=a.length;
        int flag=0,index=0;
        for(int i=0;i<l;i++)
        {
            if(a[i]==x)
            {
                flag=1;
                index=i+1;
                break;
            }
        }
        if(flag==1)
            System.out.println("The element "+x+" is found at index."+index);
        else
            System.out.println("The element is not present.");
    }    
}

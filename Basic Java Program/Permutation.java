public class Permutation
{
    public static void main(String args[])
    {
        permute("ABCD");
    }
    public static void permute(String full)
    {
        if(full==null || full.length()==0)
        {
            System.out.println("There is no string.");
            return;
        }
        permute("",full);
    }
    public static void permute(String prefix, String remaining)
    {
        if(remaining.length()==0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<remaining.length();i++)
        {
            permute(prefix + remaining.charAt(i),remaining.substring(0, i)+ remaining.substring(1+i,remaining.length()));
        }
    }
}
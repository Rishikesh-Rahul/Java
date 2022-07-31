
// Program to add and remove the element in the arrayLists


import java.util.ArrayList;

class ArrayList1
{
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rishikesh");
        list.add("Rahul");
        list.add("Rishav");
        list.add("Raj");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("Raj");
        System.out.println(list);
        list.clear();
        System.out.println();
    }
}
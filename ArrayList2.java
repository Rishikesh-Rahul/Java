import java.util.ArrayList;

public class App
{
    static ArrayList<String> arraylist= new ArrayList<>();
    public static void main(String args[])
    {
        arraylist.add("Rishikesh");
        arraylist.add("Rahul");
        arraylist.add("Rishav");
        arraylist.add("Raj");
        App app = new App();
        app.displayList(arraylist);
    }
    void displayList(ArrayList<String> names)
    {
        for(String name: names)
        {
            System.out.println(name);
        }
    }
}
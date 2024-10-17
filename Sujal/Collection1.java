import java.util.*;

public class Collection1
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>(); //Creating Arraylist

        list.add("Mital");//Adding object in arraylist
        list.add("Sheetal");
        list.add("Hiral");
        list.add("Pinal");
        Iterator itr = list.iterator();// Traversing list through Iterator

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
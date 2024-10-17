import java.util.*;

public class Collection 
{
    public static void main(String args[]) 
    {
        ArrayList<String> list=new ArrayList<String>();

        list.add("Yash");
        list.add("Sujal");
        list.add("Shailesh");
        list.add("Vivek");

        Iterator itr=list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }   
}

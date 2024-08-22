import java.util.ArrayList;
public class arraylist2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println((arr));
        // Add items
        arr.add(34);        
        System.out.println((arr));
        arr.add(55);
        System.out.println((arr));

       
        arr.add(0,12);
        System.out.println((arr));
        arr.add(3,78);
        System.out.println((arr));
        arr.add(4,89);
        System.out.println((arr));
        arr.add(5,24);
        System.out.println((arr));

        //remove items
        arr.remove(0);
        System.out.println((arr));

        arr.remove(1);
        System.out.println((arr));

        //update items
        arr.set(0,56);
        System.out.println((arr));

        //TRAVERSAL
        System.out.println((arr.size()));   //for size of arraylist

                //read  values;

                System.out.println(arr.get(0));

        // for loop for all indexes;
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));

        }

        //for each for all values 
        for(Integer val:arr)
        {
            System.out.println(val);
        }







    }
}

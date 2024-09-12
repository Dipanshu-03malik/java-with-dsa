import java.util.*;
public class subsequancewitharraylist {
   public static void printsubsequnce(int [] arr,int i,ArrayList<Integer> ans,int k)
   {
    if(i==arr.length)
    {
        int temp=0;
        for(i=0;i<ans.size();i++)
        {
            temp =temp+ans.get(i);
        }
        if(temp==k)
                          
        {System.out.println(ans);}
        return;
    }
    
    ans.add(arr[i]);
    printsubsequnce(arr, i+1, ans,k);
    ans.remove(ans.size()-1);
    printsubsequnce(arr, i+1, ans,k);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4};
        int k=5;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        printsubsequnce(arr,0,ans,k);
        sc.close();
    }
}

package MyTree;
/**
 * Treenode
 */
import java.util.*;

public class Tree {
    TreeNode root;
    Scanner sc=new Scanner(System.in);
    Tree()
    {
        root=Build();
    }
    private TreeNode Build()
    {
        //ToDo Auto-genrated method stub
        System.out.println("Enter Data");
        int data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        TreeNode root =new TreeNode(data);
        System.out.println("Enter the left cchild data of  "+data);
        root.left=Build();
        System.out.println("Enter the right cchild data of  "+data);
        root.right=Build();
        return root;
    }
}

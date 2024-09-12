package MyTree;

public class client {
    public static void preorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data);

        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root) {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        
    }
    public static void postorder(TreeNode root) {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data);
    }
    public static void main(String [] args)
    {
        //1 2 -1 -1 3 4 6 -1 -1 7 -1 -1 5 -1 -1
        Tree t=new Tree();
        System.out.print("preorder");
        preorder(t.root);
        System.out.println("\n inorder");
        inorder(t.root);
        System.err.println("\n postorder");
        postorder(t.root);
    }
}

package MyTree;
import java.util.*;
public class Client {
	static int max=0;
	
	public static int Count (TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left_count=Count(root.left);
		int right_count=Count(root.right);
		
		return left_count+right_count +1;
	}
	public static int Sum (TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left_Sum=Sum(root.left);
		int right_Sum=Sum(root.right);
		
		return left_Sum+right_Sum +root.data;
	}
    public static int maxDepth(TreeNode root) {
    	if(root==null) {
		return 0;
	}
    	
    	
	int left_count=maxDepth(root.left);
	int right_count=maxDepth(root.right);
	
	int ans= Math.max(left_count,right_count) +1;
    return ans;
}
    
	public static void Preorder (TreeNode root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+"  ");
		Preorder(root.left);
		Preorder(root.right);
	}
	public static void Inorder (TreeNode root) {
		if(root==null) {
			return ;
		}
		Inorder(root.left);
		System.out.print(root.data+"  ");
		Inorder(root.right);
	}
	public static void Postorder (TreeNode root) {
		if(root==null) {
			return ;
		}
	
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data+"  ");
	}
	public static void Display (TreeNode root,String ans) {
		if(root==null) {
			
			return ;
		}
		if(root.left==null && root.right==null) {
    		System.out.println(ans+root.data);
    		
    		return;
    		}
		Display(root.left,ans+root.data);
		Display(root.right,ans+root.data);
		
	}
	
	public static void  Max_Sum (TreeNode root,int ans) {
		if(root==null) {	
			return ;
		}
		if(root.left==null && root.right==null) {
    		int Final=ans+root.data;
  
    		//System.out.println("Max SUM="+Math.max(max,Final));
    		max=Math.max(max, Final);
    		//System.out.println("Max SUM="+max);
    		}
		Max_Sum(root.left,ans+root.data);
		Max_Sum(root.right,ans+root.data);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void BFS (TreeNode root) {
		
		LinkedList<TreeNode> q=new LinkedList();
		q.add(root);
		while(q.size()>0) {
			//Remove the front Node
			TreeNode rn=q.removeFirst();
			//Work on remove Node
			System.out.println(rn.data);
			//Add the Children
			if(rn.left!=null) {
				q.addLast(rn.left);
			}
			if(rn.right!=null) {
				q.addLast(rn.right);
			}
		}
	}
	
	public static void LeftView(TreeNode root,int level,HashMap<Integer,Integer> hm) {
		if(root==null) {
			return;
		}
		
		if(hm.containsKey(level)==false) {
			hm.put(level,root.data);
			System.out.println(root.data+" Its level is="+level);
		}
		
		LeftView(root.left,level+1,hm);
		LeftView(root.right,level+1,hm);
	}
	public static void TopView(TreeNode root,int x,HashMap<Integer,Integer> hm) {
		if(root==null) {
			return;
		}
		
		if(hm.containsKey(x)==false) {
			hm.put(x,root.data);
			//System.out.println(root.data+" Its level is="+x);
		}
		
		TopView(root.left,x-1,hm);
		TopView(root.right,x+1,hm);
	}
	public static void BottomView(TreeNode root,int x,HashMap<Integer,Integer> hm) {
		if(root==null) {
			return;
		}
			hm.put(x,root.data);
		
		BottomView(root.left,x-1,hm);
		BottomView(root.right,x+1,hm);
	}
	
	
	public static void RightView(TreeNode root,int level,HashMap<Integer,Integer> hm) {
		if(root==null) {
			return;
		}
		hm.put(level,root.data);
		
		RightView(root.left,level+1,hm);
		RightView(root.right,level+1,hm);
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// todo Auto-generated method stub
		// 3 1 4 -1 -1 -1 2 -1 5 -1 -1
		// 1 2 -1 -1 3 4 6 -1 -1 7 -1 -1 5 -1 -1
		// 1 2 3 4 5 6 7 -1 -1 8 9 -1 -1 -1 -1 -1 -1 -1 -1 
		Tree t=new Tree();
		
//		System.out.println("Preorder");
//		Preorder(t.root);
//		System.out.println();
//		System.out.println("Inorder");
//		Inorder(t.root);
//		System.out.println();
//		System.out.println("Postorder");
//		Postorder(t.root);
//		
//		System.out.println("\nCount="+Count(t.root));
//		System.out.println("Sum="+Sum(t.root));
//		System.out.println("Max Height="+maxDepth(t.root));
//		System.out.println("All Path");
		// Display(t.root,"");
//		Max_Sum(t.root,0);
//		System.out.println("Max SUM="+max);
//		System.out.println("BFS");
		HashMap<Integer,Integer> hm=new HashMap();
//		System.out.println("\nleft VIEW");
//		LeftView(t.root,0,hm);
//		System.out.println("\nRIGHT VIEW");
//		RightView(t.root,0,hm);
//		System.out.println("\nTOP VIEW");
//		TopView(t.root,0,hm);
		System.out.println("\nBottom VIEW");
		BottomView(t.root,0,hm);
		for(Integer key:hm.keySet()) {
			System.out.println(hm.get(key));
		}
		
	}

}

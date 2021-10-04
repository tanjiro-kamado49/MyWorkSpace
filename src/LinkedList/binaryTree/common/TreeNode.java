package LinkedList.binaryTree.common;
import java.util.*;
public class TreeNode{ 
    public int val;
    public TreeNode left;
    public TreeNode right;
    public static TreeNode create(){
        int x;
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter value to print at node or -1 to add null");
        x=sc.nextInt();
        if(x==-1){
            return null;
        }
        TreeNode newnode=new TreeNode();
        newnode.val=x;
        System.out.println("Enter left child of"+x);
        newnode.left=create();
        System.out.println("Enter right child of"+x);
        newnode.right=create();
        sc.close();
        return newnode;

    }
    public static void main(String [] args){
    }

}
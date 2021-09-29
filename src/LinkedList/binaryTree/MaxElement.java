package LinkedList.binaryTree;
import LinkedList.binaryTree.common.TreeNode;
public class MaxElement{
    static int max_element(TreeNode root){
        int root_val=0,left=0,right=0,max=Integer.MIN_VALUE;
        if(root!=null){
            root_val=root.val;
            left=max_element(root.left);
            right=max_element(root.right);

        }
        if(left<right){
            max=right;
        }
        else{
            max=left;
        }
        if(root_val > max){
            max=root_val;
        }
        return max;
    }
    public static void main(String[]args){
        TreeNode root=TreeNode.create();
      
        System.out.println("Maximum element in binary tree :"+max_element(root));
    } 
}


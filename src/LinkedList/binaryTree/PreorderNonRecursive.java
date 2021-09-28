package LinkedList;
import java.util.*;

import LinkedList.common.TreeNode;
public class  PreorderNonRecursive{
    public static void main(String []args){
         TreeNode root=TreeNode.create();
        Stack<TreeNode> s=new Stack<>();
        System.out.println("Preorder Traversal:");
        boolean flag=true;
        
        while(flag==true){
            while(root!=null){
                System.out.println(" "+root.val);
                s.push(root);
                root=root.left;

            }
            if(s.empty()==true){
                flag=false;
                break;
            }
            root=s.pop();
            root=root.right;
        }
    }
}
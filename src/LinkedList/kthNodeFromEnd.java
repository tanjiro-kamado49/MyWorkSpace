package LinkedList;
import java.util.*;
import LinkedList.common.*;
public class kthNodeFromEnd{

    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7};
        Node list=Node.createList(arr);
        Node.display(list);
        Node ans= kthNodeFromEnd(list,2);
        System.out.println();
        System.out.println(ans.data);
        
    }
    
    public static Node kthNodeFromEnd(Node head, int k){
    
        Node cur=head;
        Node result = head;
        for(int i=0;i<k-1;i++){
            cur=cur.next;
        }
        while(cur.next!=null){
            cur=cur.next;
            result=result.next;

        }
        return result;
    }

}
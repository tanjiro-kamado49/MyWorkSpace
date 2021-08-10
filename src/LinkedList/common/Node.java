package LinkedList.common;
import java.io.*;
public class Node{
    public int data;
    public Node next;
    public Node(int x){
        data=x;
        next=null;
    }
    public static Node insert(Node head,int data){
        Node new_node=new Node(data);
        new_node.next=null;
        Node temp=head;
        if(head==null){
            head=new_node;
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        return head;
    }
    public static Node delet_key(Node head,int key){
        Node cur=head;
        Node prev=null;
        if(cur!=null && head.data==key){
            head=cur.next;
            System.out.println("\nFound and delete");
            return head;
        }
        while(cur!=null&& cur.data!=key){
            prev=cur;
            cur=cur.next;
        }
        if(cur!=null){
            prev.next=cur.next;
            System.out.println("\nFound and deleted");
        }
        if(cur==null){
            System.out.println("\nNot found");
        }
        return head;

    }
    public static Node delet_pos(Node head,int pos){
        Node temp=head;
        Node cur=head,prev=null;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        if(l<pos ||pos<=0){
            System.out.println("Invalid position");
        }


        else if(cur!=null && pos==1){
            head=head.next;
            System.out.println("\n"+pos+"position element deleted");
            return head;
        }
        else {
            int i=1;
            while(cur!=null){
                if(pos!=i){
                    prev=cur;
                    cur=cur.next;
                    i++;
                }
                else{
                    prev.next=cur.next;
                    System.out.println("\n"+pos+"position element deleted");
                    break;
                }

            }
          

        }
        return head;
    }
    public static void display(Node head){
        if(head==null){
            System.out.println("Empty List");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node createList(int arr[]){
        if(arr==null){
            return null;
        }
        Node head=null;
        Node temp=null;
        for(int i=0;i<arr.length;i++){
            Node new_node=new Node(arr[i]);
            new_node.next=null;
            if(head==null){
                head=temp=new_node;
            }
            else{
                temp.next=new_node;
                temp=new_node;

            }
        }
        return head;
    }
    public static void main(String[] args){
        Node head=null;
        Node tail=null;
        head=insert(head,11);
        head=insert(head,22);
        head=insert(head,33);
        head=insert(head,44);
        System.out.println("Linked List");
        display(head);
       /*head= delet_key(head,33);
        display(head);
        head=delet_key(head,11);
        display(head);
        head=delet_key(head,22);
        display(head);
        head=delet_key(head,44);
        display(head); 
        head=delet_key(head,33);
        display(head);*/
         head=delet_pos(head,3);
        display(head);
        head=delet_pos(head,4);
        display(head);
        head=delet_pos(head,1);
        display(head);
        Node list;
        int arr[]={11,22,33,44,55,66};
        list=createList(arr);
        System.out.println("\nlinked list: ");
        display(list);


    }

}    
   
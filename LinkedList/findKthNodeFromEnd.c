#include "common/Node.h"
#include <stdio.h>
#include <stdlib.h>

void main(){
    struct node*head=NULL;
    printf("\n Enter data in linked list");
    create(&head);
    display(&head);
    int n=getNode(&head);
    int k;
    printf("\nEnter position: ");
    scanf("%d",&k);
    
    if(n<n-k+1 ||n-k+1<=0 ){
        printf("Invalid Position");
    }
    else{
        struct node*result=head;
        struct node*cur=head;
        for(int i=0;i<k-1;i++){
            cur=cur->next;
        }
        while(cur->next!=NULL){
            cur=cur->next;
            result=result->next;

        }
        printf("\nData at %dth position  from end: %d  ",k,result->data);
    }
}
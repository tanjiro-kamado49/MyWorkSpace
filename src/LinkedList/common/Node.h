#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node* next; 
};
int getNode(struct node **head)
{  int count=0;
  struct node *temp;
  temp = *head;
  if (*head == NULL)
  {
    count = 0;
    printf("\nLinked list is empty\n");
  }
  else
  {
    while (temp != NULL)
    {
      count++;
      temp = temp->next;
    }
  }
  return count;
}
struct node* create(struct node **head)
{
  struct node *newnode, *temp;
  temp = *head;
  int val;
  int choice = 1;
  while (choice != 0)
  {
    struct node*newnode = (struct node *)malloc(sizeof(struct node));
    printf("\n Enter value: ");
    scanf("%d", &val);
    newnode->data = val;
    if (*head == NULL)
    {
      newnode->next = NULL;
      *head = newnode;
      temp = *head;
    }
    else
    {
      temp->next = newnode;
      newnode->next = NULL;
      temp = newnode;
    }
    fflush(stdin);
    printf("\ninsert more element type '1' for yes and '0' for no: ");
    scanf("%d", &choice);
  }
  return *head;
}
void display(struct node **head)
{
  struct node *ptr = *head;
  if (head == NULL)
  {
    printf("\n Linked list is empty.");
    return;
  }
  printf("\n");
  printf("----***displaying elements***--------\n");
  while (ptr != NULL)
  {
    printf("%d->", ptr->data);
    ptr = ptr->next;
  }
  printf("End\n");
}
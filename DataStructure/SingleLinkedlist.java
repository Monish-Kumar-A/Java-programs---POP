package DataStructure;

import java.util.*;


class node{
    int data;
    node next;
    node(int num){
        data=num;
        next=null;
    }

}

class LinkedList{
    node head,tail,newNode,temp;
    void insert(int num){
        newNode=new node(num);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        //tail.next=head; Single Circular Linked List
    }
    void display(){
        temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
}
public class SingleLinkedlist {

public static void main(String[] args) {
    LinkedList  LL=new LinkedList();
    LL.insert(1);
    LL.insert(2);
    LL.insert(3);
    LL.insert(4);
    LL.display();
}
}


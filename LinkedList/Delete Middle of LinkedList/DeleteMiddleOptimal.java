import java.util.*;
class Node{
	int data;
	Node next;
	Node(){
		next=null;
	}




}
class LinkedList{
	Node head=null;

	void createList(int data){
		Node p=new Node();
		p.data=data;
		if(head==null){
			head=p;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=p;
		
		}
	
	
	
	}
	void display(){
		Node temp=head;
	        while(temp!=null){
			System.out.print(temp.data+" --> ");
			temp=temp.next;
                
		}	

		System.out.print("null ");
		System.out.println();


	
	}
	Node deleteMiddle(){
		if(head==null || head.next==null){
			return head;
		}
		Node slow=head;
		Node fast=head;
		fast=fast.next.next;
	
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		
		
		
		}
		Node ele=slow.next;
		slow.next=slow.next.next;
		return ele;	
	}
}
class Client14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();

		System.out.println("Enter 1 if you want to create linked list : ");
		int no=sc.nextInt();
		char ch;
		do{
			System.out.println("Enter data : ");
                	int data=sc.nextInt();
			ll.createList(data);
			System.out.println("Enter Y or y if you want to add node again: ");
			ch=sc.next().charAt(0);
		
		
		}
		while(ch=='Y' || ch=='y');
	
	
		System.out.print("Given Linked List : ");
	 	ll.display();
	 	System.out.println();
		Node ans=ll.deleteMiddle();
		System.out.println("Element Deleted from Linked List : "+ans.data);
		System.out.print("Linked List after deleting middle element : ");
                ll.display();
                System.out.println();
                
                
	}
}


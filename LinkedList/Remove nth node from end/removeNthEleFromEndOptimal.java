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
	int removeNthEleFromEnd(int k){
	
		Node fast=head;
		while(k>0){
			fast=fast.next;
			k--;
		}
		if(fast==null){
			head=head.next;
		}
		Node slow=head;
		while(fast.next!=null){
			slow=slow.next;
			fast=fast.next;
		
		}

			Node n=slow.next;
			slow.next=slow.next.next;
			return n.data;
		
		
	}
}
class Client8{
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
		System.out.println("Enter position of node you want to delete : ");
		int k=sc.nextInt();
		System.out.println("Nth Element deleted from Last in Linked List : "+ ll.removeNthEleFromEnd(k));
		System.out.print("Linked List after deletion of "+ k+" th element : ");
                ll.display();
		System.out.println();

	}
}


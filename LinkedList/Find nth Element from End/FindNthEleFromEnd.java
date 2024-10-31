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
	int findNthEleFromEnd(int k){
	
		Node current=head;

		for(int i=0;i<k-1;i++){
			current=current.next;
		
		}
		if(current==null){
			return head.data;
		}
		else{
			 Node previous=head;
			 while(current.next!=null){
			 	current=current.next;
				previous=previous.next;
			 
			 }
			 return previous.data;
		
		
		
		
		}
		
		
	}
}
class Client3{
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
		System.out.println("Enter value of k : ");
		int k=sc.nextInt();
		System.out.println("Nth Element from Last in Linked List : "+ ll.findNthEleFromEnd(k));
                System.out.println();
	}
}


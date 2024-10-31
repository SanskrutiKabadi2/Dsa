import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}




}
class LinkedList{
	Node head=null;

	void createList(int data){
		Node p=new Node(data);
	
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
	
	 void sortOptimal(){
		Node temp=head;
		Node temp0=new Node(-1);
		Node temp1=new Node(-1);
		Node temp2=new Node(-1);
		Node zero=temp0;
		Node one=temp1;
		Node two=temp2;
	
		while(temp!=null){

			if(temp.data==0){
				zero.next=temp;
				zero=zero.next;
				
			}
			else if(temp.data==1){
				one.next=temp;
				one=one.next;
			
			}
			else{
				two.next=temp;
				two=two.next;

			}
			temp=temp.next;
		}
		
		zero.next=temp1.next;
		one.next=temp2.next;
		two.next=null;
		head=temp0.next;
			// TC- O(n)
			// SC - O(1)	


		
	}
}
class Sortll012{
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
		ll.sortOptimal();
		System.out.println("Linked List After Sorting  : ");
		ll.display();
                System.out.println();
                
                
	}
}


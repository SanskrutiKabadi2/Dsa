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
	int searchElement(int k){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			if(temp.data==k){
				return count;
			}
			temp=temp.next;
		}
			return -1;
		
		
	}
}
class Client5{
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
		int ans=ll.searchElement(k);
		if(ans!=-1){
		  System.out.println("Element foundn at index : "+ans);
		}
		else{

			System.out.println("Element not present in LinkedList");
		}
                System.out.println();
	}
}


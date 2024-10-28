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
	 void sort(){
		Node temp=head;
		int count0=0;
		int count1=0;
		int count2=0;
		while(temp!=null){

			if(temp.data==0){
				count0++;
			}
			else if(temp.data==1){
				count1++;
			
			}
			else{
				count2++;

			}
			temp=temp.next;
		}
		temp=head;
		 while(temp!=null){

                        if(count0!=0){
				temp.data=0;
                                count0--;
                        }
                        else if(count1!=0){
				temp.data=1;
                                count1--;

                        }
                        else{
				temp.data=2;
                                count2--;

                        }
                        temp=temp.next;
                }
			// TC- O(2n)
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
		ll.sort();
		System.out.println("Linked List After Sorting  : ");
		ll.display();
                System.out.println();
                
                
	}
}


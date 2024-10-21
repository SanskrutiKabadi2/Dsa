import java.util.*;
class Queue{
	int front=-1;
	int rear=-1;
	int maxSize;
	int queue[];
	Queue(int size){
		this.queue=new int[size];
		this.maxSize=size;
	}
	void enqueue(int data){
		if(rear==maxSize-1){
			System.out.println("Queue is full!");
			return;
		}
		else if(front==-1){
                        front=0;
                    
                }
		queue[++rear]=data;
	}
	int dequeue(){
		
		if(front==-1){
			return -1;
		}
		else{
			int temp=queue[front];
			front++;
			if(front>rear)
				front=rear=-1;
			return temp;
		}
	}
	boolean empty(){
		boolean flag=false;
		if(front==-1){
			flag=true;
		}
		return flag;
	
	}
	int front(){
		if(front==-1){
			return -1;
		}
		else{
                        return queue[front];
		}

	}


}

class Client{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of elements : ");
        int size=sc.nextInt();
	Queue qe=new Queue(size);
	char ch;
	do{
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.Empty");
		System.out.println("4.Front");
		System.out.println("5.Rear");
		System.out.println("6.Print Queue");

		System.out.print("Enter your choice : ");
		int choice=sc.nextInt();

		switch(choice){
			case 1:{
				 System.out.println("enter the data tou want to add :");
				 int data=sc.nextInt();
				 qe.enqueue(data);
			
			}
			break;	
			 case 2:{
				int ret=qe.dequeue();
				if(ret==-1){
					System.out.println("queue is empty");
				}
				else{
					 System.out.println(ret+" is deleted from queue");
				}
                        }
                        break;
			 case 3:{
					boolean ret=qe.empty();
					if(ret==true){
						 System.out.println("Queue is empty!");
					}	
					else{
					
					 System.out.println("Queue is not empty!");
					}

                        }
                        break;
			 case 4:{
				int ret=qe.front();
                                if(ret==-1){
                                        System.out.println("queue is empty");
                                }
                                else{
                                         System.out.println(ret+" is a front element");
                                }

                        }
                        break;
			 case 5:{


                        }
                        break;
			 case 6:{


                        }
                        break;
			default:
				System.out.println("Wrong input!");
				break;
		
		
		}
		 System.out.print("do you want to continue : ");
		 ch=sc.next().charAt(0);
	}
	while(ch=='Y' || ch=='y');

	}
}

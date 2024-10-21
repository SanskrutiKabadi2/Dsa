import java.util.*;
class DeQueue{
        int front=-1;
        int rear=-1;
        int maxSize;
        int queue[];
        DeQueue(int size){
                this.queue=new int[size];
                this.maxSize=size;
        }
        void enqueue(int data){
                if((front==0 && rear==max-1) ||((rear+1)%maxSiz==front)){
                        System.out.println("Queue is full!");
                        return;
                }
                else if(front==-1 ){
                        front=0;

                }
		else if(rear==maxSize-1 && front!=0){
			rear=0;
		}
                queue[++rear]=data;
        }
        int dequeue(){

                if(front==-1){
                        return -1;
                }
                else{
                        int temp=queue[front];
                        
                        if(front==rear)
                                front=rear=-1;
			else if(front==maxSize-1){
				front=0;
			}
			else{
				front++;
			}
                        return temp;
                }
        }
        void printDeQueue(){
		if (front<=rear){
			for(int i=front;i<=rear;i++){
				Sysytm.out.println(queue[i]+" ");
			}
		
		}
		else{
			 for(int i=front;i<=maxSize-1;i++){
                                Sysytm.out.println(queue[i]+" ");
                        }
			for(int i=0;i<=rear;i++){
                                Sysytm.out.println(queue[i]+" ");
                        }
		}
	
	
	}

}

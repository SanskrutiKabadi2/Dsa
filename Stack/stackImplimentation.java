import java.util.*;
class Stack1{
	int maxSize;
	int arr[];
	int top=-1;
	Stack1(int size){
		this.arr=new int[size];
		this.maxSize=size;
	
	}
	void push(int data){
		if(top==maxSize-1){
			System.out.println("Stack OverFlow!");
			return;
		}
		else{
			top++;
			arr[top]=data;
		}
	}
	int pop(){
		if(empty()){
			 System.out.println("Stack is empty");
			 return -1;
		}
		else{
			int ele=arr[top];
			top--;
			return ele;
		}
	}
	
	 int peek(){
                if(empty()){
                         System.out.println("Stack is empty");
                         return -1;
                }
                else{
                        return arr[top];
                }
        }
	boolean empty(){
		if(top==-1){
			return true;
		}
		else{
			return false;
		}
	
	}
	int size(){
		return top;
	
	}
	void printStack(){
		for(int i=0;i<=top;i++){
			  System.out.println(arr[i]);
		
		}
	}
}
class Client1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of stack :");		
		int size=sc.nextInt();
		Stack1 s=new Stack1(size);
		char ch;

		do{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Empty");
			System.out.println("5.Size");
			System.out.println("6.PrintStack");

			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			
			switch(choice){
				case 1:{
					       System.out.println("enter the element :");
				       		int data=sc.nextInt();
				 		s.push(data);

					}
				        break;
				
				 case 2:{
                                        	int ele=s.pop();
						if(ele!=-1){
							System.out.println(ele +" is deleted from stack");
						}
                                        }
                                        break;
				
				 case 3:{
                                                int ele=s.peek();
                                                if(ele!=-1){
                                                        System.out.println(ele +"  is peek element");
                                                }
                                        }
                                        break;
				case 4:{
                                                  
                                                if(s.empty()){
                                                        System.out.println("stack is empty");
                                                }
						else{
							 System.out.println("stack is not empty");
						}
                                        }
                                        break;
				 case 5:{
						if(s.empty()){
							System.out.println("Stack is empty!");
						}	
						else{
							int n=s.size();
							System.out.println("stack size is "+(n+1));
						}	
                                        }
                                        break;
				  case 6:{

					 System.out.println("stack elements : ");
					s.printStack();
                                        }
                                        break;

				 default:
					 System.out.println("Ohho! Wrong input");
				 	 break;	 
			}
			System.out.println("do you want to continue :");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	
	
	}
}

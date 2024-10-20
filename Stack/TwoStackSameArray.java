import java.util.*;
class TwoStack{
	int arr[];
	int top1;
	int top2;
	int maxSize;
	TwoStack(int s){
		this.arr=new int[s];
		this.top1=-1;
		this.top2=s;
		this.maxSize=s;
	}

	void push1(int data){
		if(top2-top1>1){
			top1++;
	                arr[top1]=data;

		}
		else{
			System.out.println("Stack OverFlow!");
		}
	
	}
	void push2(int data){
		 if(top2-top1>1){
		 	top2--;
                	arr[top2]=data;
		 }
		 else{
                        System.out.println("Stack OverFlow!");
                }
        }
	int pop1(){
		if(top1==-1){
			 System.out.println("Stack UnderFlow!");
			 return -1;
		}
		else{
			int val=arr[top1];
			top1--;
			return val;
		}
	
	}

	 int pop2(){
                if(top2==maxSize){
                         System.out.println("Stack UnderFlow!");
                         return -1;
                }
                else{
                        int val=arr[top1];
                        top2++;
                        return val;
                }

        }
	void printArr1(){
		System.out.println("Array1 :");
		for(int i=0;i<=top1;i++){
			System.out.println(arr[i]);
		}
	}
	void printArr2(){
                System.out.println("Array2 :");
                for(int i=maxSize-1;i>=top2;i--){
                        System.out.println(arr[i]);
		}
        }
	
}
class Client3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size=sc.nextInt();
		TwoStack ts=new TwoStack(size);
		

		char ch;
		do{
			System.out.println("1.Push1");
			System.out.println("2.Push2");
			System.out.println("3.Pop1");
			System.out.println("4.Pop2");
			System.out.println("5.Print Array1");
			System.out.println("6.Print Array2");
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			switch(choice){
				case 1:{
					 System.out.println("Enter value for stack1");
					 int data=sc.nextInt(); 
					 ts.push1(data);
				}
				break;
			
				case 2:{
					
                                         System.out.println("Enter value for stack2");
                                         int data=sc.nextInt();
                                         ts.push2(data);

                                }
                                break;

				case 3:{
					int ret=ts.pop1();
					if(ret!=-1){
						System.out.println(ret +" is poped from stack1");
					}

                                }
                                break;
				case 4:{
					int ret=ts.pop2();
                                        if(ret!=-1){
                                                System.out.println(ret +" is poped from stack2");
                                        }
				
                                }
                                break;
				 
				case 5:{
					       ts.printArr1();
				}
				break;

				case 6:{
                                               ts.printArr2();
                                }
                                break;

				default:
				{
					 System.out.println("Wrong Choice");
				}
			        break;

			  
			}
			System.out.println("Do you want to continue? ");
                        ch=sc.next().charAt(0);
                 
		
		}
		while(ch=='y' || ch=='Y');
	}
}


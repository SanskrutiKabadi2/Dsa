import java.util.*;
class CountDigitElement{
	public static void main(String[] args){
		int size;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=Sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements of array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Sc.nextInt();
		}

		
		for(int i=0;i<arr.length;i++){
			 int count=0;
			 int N=arr[i];
			 while(N!=0){
			 	count++;
			       N=N/10;	
			  
			  }
			 System.out.println("Count of digit in"+" "+arr[i]+":"+count);
		}	
		
	}
	
	
	
}































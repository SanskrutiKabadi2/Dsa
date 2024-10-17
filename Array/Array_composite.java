import java.util.*;

class Array_composite{
	public static void main(String[] args){
		int size;
		System.out.println("Enter size of array:");
		Scanner Sc=new Scanner(System.in);
		size=Sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Sc.nextInt();

		}	  
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;	
				}
			
			}
			if(count>2){
				System.out.println("Composite element"+" "+arr[i]+" "+"found at index:"+i);
			
			}
		
		
		}	
	}




}

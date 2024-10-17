import java.util.*;
class PrimNumber{
	  public static void main(String[] args){
		 int size;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=Sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of array:");
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
			if(count==2){
				  System.out.println("Prime element"+" "+arr[i]+" "+"Found at index:"+i);
			
			}
			

                }

	}
	
}




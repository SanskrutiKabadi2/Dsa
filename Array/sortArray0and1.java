import java.util.*;
class Sort0and1{
	static int[]sort(int arr[]){
		int left,right;
		int i=0,j=arr.length-1;
		  while(i<=j){
			left=arr[i];
			right=arr[j];			
			 if(left==0){
			 	i++;
			 
			 }
			  if(right==1){                                                                                                                                                       j--;                                                                                                                                                                                                                                                                                                             }
			   if(left==1 && right==0){

				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;

			   }
			                                                                                                                                                                                                                                                                                                                                                        									                                              }

		  return arr;
	}



	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		
		}

		sort(arr);
		System.out.println("Sorted arry : ");
		  for(int i=0;i<size;i++){
                         System.out.println(arr[i]);


                }
	
	
	
	
	}















}

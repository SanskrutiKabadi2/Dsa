import java.util.*;
class Array1{
	static void print(int arr[]){
		System.out.println("Array elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
	}
	public static void main(String[] args){
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=Sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Sc.nextInt();
                       
		}
		print(arr);
	}






}

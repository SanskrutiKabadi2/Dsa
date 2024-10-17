import java.util.*;

class Array_minimumElement{
	public static void main(String[] args){
		int size;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=Sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Sc.nextInt();
		}
		int small=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<small){
				small=arr[i];
				index=i
			}
		}
		System.out.println("Smallest element"+" "+small+" "+"is fount at index:"+" "+index);
	}




}

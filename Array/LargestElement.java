import java.util.*;
class Array_maximumElement{
	int size;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	size=Sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter array elements:");
	for(int i=0;i<arr.length;i++){
		arr[i]=Sc.nextInt();
	}
	int max=INTEGER.MIN_VALUE;
	int index=0;
	for(int i=1;i<arr.length;i++){
		if(arr[i]<max){
			max=arr[i];
			index=i;
		}

	}
	System.out.println("Maximum element"+" "+max+" "+"found at index:"+" "+index);

	}
}



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
	int max=0;
	for(int i=1;i<arr.length;i++){
		if(arr[i]<arr[max]){
			max=i;
		}

	}
	System.out.println("Maximum element"+" "+arr[max]+" "+"found at index:"+" "+max);

	}
}



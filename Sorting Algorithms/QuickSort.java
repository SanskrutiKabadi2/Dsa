import java.util.*;
class QuickSort{
	static void quickSort(int arr[],int start,int end){
		if(start<end){
			int pos=partition(arr,start,end);
			 quickSort(arr,start,pos-1);
			 quickSort(arr,pos+1,end);
		
		}
	}
	static int partition(int arr[],int start,int end){
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<end;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		}
		int temp=arr[i+1];
                arr[i+1]=arr[end];
                arr[end]=temp;
		return i+1;
	}

	static void printArray(int arr[],int size){
                for(int i=0;i<size;i++){
                         System.out.print(arr[i]+" ");

                }
                System.out.println();
        }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of an array :");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Unsorted Array :");
                printArray(arr,size);
                System.out.println("Sorted Array using Quick Sort:");
                quickSort(arr,0,size-1);
                printArray(arr,size);
	
	}







}

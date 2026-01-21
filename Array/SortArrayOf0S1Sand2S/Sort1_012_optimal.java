import java.util.*;
class Sort1{
	static void Sort(int a[],int n){
		for(int i=0;i<n;i++){
			int temp=0,low=0,mid=0,high=n-1;
                	if(a[i]==0){
				temp=a[low];
				a[low]=a[mid];
				a[mid]=temp;
				low++;
				mid++;
			}
			else if(a[i]==1){
                                mid++;
                        }
			else{
				temp=a[high];
                                a[high]=a[mid];
                                a[mid]=temp;
				high--;
			}
		}
	}
	static void Print(int arr[],int n){
		 for(int i=0;i<n;i++){
                        System.out.print(arr[i]+" ");

                }
	
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter number of  elements : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		
		}
		Sort(arr,n);
		Print(arr,n);
	
	}
}

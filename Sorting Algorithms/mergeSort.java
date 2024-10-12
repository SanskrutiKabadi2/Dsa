import java.util.*;
class MergeSort{

	static void merge(int arr[],int start,int mid,int end){
	
		int n1=mid-start+1;
		int n2=end-mid;

		int left[]=new int[n1];
		int right[]=new int[n2];

		for(int i=0;i<n1;i++){
			left[i]=arr[start+i];
		
		}
		for(int j=0;j<n2;j++){                                                                                                                                              right[j]=arr[mid+1+j];                                                                                                                                                                                                                                                                                           }
		int i=0,j=0,k=start;
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				arr[k]=left[i];
				i++;
			
			}

			else if(right[j]<=left[i]){
				arr[k]=right[j];
				j++;

			}
			k++;


		}
		while(i<n1){
		
			arr[k]=left[i];
			i++;
			k++;

		}
		 while(j<n2){
                        arr[k]=right[j];                                                                                                                                             j++;                                                                                                                                                        k++;                                                                                                                                                                                                                                                                                                            }
	
	
	
	
	
	
	}


	static void mergeSort(int arr[],int l,int r){

			if(l<r){

			int m=l+(r-l)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	
	
	
	
}


		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter size of array :");
			int n=sc.nextInt();
			
			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			
			}
			System.out.println("Given Array : "+Arrays.toString(arr));
			mergeSort(arr,0,n-1);
			System.out.println("Sorted Array : "+Arrays.toString(arr));
		
		}

}

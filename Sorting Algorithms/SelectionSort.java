import java.util.*;                                                                                                                                         class SelectionSort{                                                                                                                                                   static void sort(int arr[],int size){                                                                                                                                  for(int i=0;i<size-1;i++){
				int small=i;
                         for(int j=i+1;j<size;j++){
                                 if(arr[j]<arr[small]){
                                        small=j;



                                 }

                           }
			 int temp=arr[i];
			 arr[i]=arr[small];
			 arr[small]=temp;
                    }



        }

        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter array size : ");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter array elements : ");
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();

                }

                System.out.print("Given Array : ");
                for(int i=0;i<size;i++){                                                                                                                                          System.out.print(arr[i]+" ");                                                                                                                                                                                                                                                                                                    }
               System.out.println( );
               System.out.print("Sorted Array : ");      
		  sort(arr,size);                                                                                                                                              for(int i=0;i<size;i++){                                                                                                                                              System.out.print(arr[i]+" ");                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                                                                }                                                                                                                                                   



}	       

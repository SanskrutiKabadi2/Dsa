import java.util.*;
class OptimizedBubbleSort{
        static void sort(int arr[],int size){
                   for(int i=0;i<size;i++){       
			boolean flag=false;			   
                         for(int j=0;j<size-i-1;j++){
                                 if(arr[j]>arr[j+1]){
                                        int temp=arr[j];
                                        arr[j]=arr[j+1];
                                        arr[j+1]=temp;
					flag=true;


                                 }
				 if(flag==true){
				 	
					 break;
				 }

                           }
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
	        sort(arr,size);                                                                                                                                            for(int i=0;i<size;i++){                                                                                                                                              System.out.print(arr[i]+" ");                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                                                               	}
 }	

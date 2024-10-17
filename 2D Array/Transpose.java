import java.util.*;
class Transpose{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter the size : ");
                int n=Sc.nextInt();
                int arr[][]=new int[n][n];
                System.out.println("Enter the elements : ");
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                arr[i][j]=Sc.nextInt();
                        }


                }
                System.out.println("Given array : ");
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();

                }
                for(int i=0;i<n;i++){
                        for(int j=i+1;j<n;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
                         
                        }

                }
		System.out.println("Transpose of array : ");
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();

                }




        }
}

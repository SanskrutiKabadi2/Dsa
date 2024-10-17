import java.util.*;
class RotateArray90AntiClockwise{
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
                for(int i=0;i<n;i++){
			int start=0,end=n-1;
                        while(start<end){
                                int temp=arr[start][i];
				arr[start][i]=arr[end][i];
				arr[end][i]=temp;
				start++;
				end--;
                        }
                     

                }
		System.out.println("Array rotated by 90 AntiClockwise : ");
		for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();

                }



        }
}

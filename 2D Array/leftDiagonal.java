import java.util.*;
class LeftDiagonal{
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
                System.out.println("Left Diagonal : ");
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
				 if(i==j){
                                	System.out.print(arr[i][j]+" ");
					break;
				}
                        }
                        System.out.println();

                }
	}
}

import java.util.*;
class AllRightDiagonals0row{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter the no of rows : ");
                int n=Sc.nextInt();
		 System.out.println("Enter the no of columns : ");
                int m=Sc.nextInt();
                int arr[][]=new int[n][m];
                System.out.println("Enter the elements : ");
                for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                                arr[i][j]=Sc.nextInt();
                        }

                }
                System.out.println("Array  : ");
                 for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                          System.out.println();


                }
                System.out.println("Right Diagonal : ");
                for(int P=m-1;P>=0;P--){
			int i=0,j=P;
                        while(i<n && j>=0){
                         	System.out.print(arr[i][j]+" ");
                                i++;
			        j--;	
                               
                        }
                        System.out.println();

                }
        }
}

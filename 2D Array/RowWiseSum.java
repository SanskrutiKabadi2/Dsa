import java.util.*;
class RowWiseSum{
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
                System.out.println("Given array : ");
                for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();

                } 
		
	// rowWise sum	
		
		System.out.println("RowWise Sum : ");
                for(int i=0;i<arr.length;i++){
			int sum=0;
                        for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
                               
                        }
                         System.out.println(sum);

                }




        }
}

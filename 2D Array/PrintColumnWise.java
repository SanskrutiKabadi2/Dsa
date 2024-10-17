import java.util.*;
class PrintColumnWise{
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
		System.out.println("Given array columnwise: ");
                for(int i=0;i<arr[i].length;i++){
                        for(int j=0;j<arr.length;j++){
                                System.out.print(arr[j][i]+" ");
                        }
                        System.out.println();

                }





        }
}

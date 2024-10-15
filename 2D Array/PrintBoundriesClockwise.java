import java.util.*;
class PrintBoundries90Clockwise{
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
		 System.out.println("Clockwise boundry of  array : ");
		 int i=0,j=0;
                for(int x=0;x<n-1;x++){
                        System.out.println(arr[i][j]);
			j++;

                }
		for(int x=0;x<n-1;x++){
                        System.out.println(arr[i][j]);
                        i++;

                }
		for(int x=0;x<n-1;x++){
                        System.out.println(arr[i][j]);
                        j--;

                }
		for(int x=0;x<n-1;x++){
                        System.out.println(arr[i][j]);
                        i--;

                }
	}
}

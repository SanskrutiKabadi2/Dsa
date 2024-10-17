import java.util.*;
class Spiral{
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
		int i=0,j=0;
		 System.out.println("array in spiral fashion : ");
		 while(n>1){
		 
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
		n=n-2;
		i++;
		j++;
		if(n==1){
			System.out.println(arr[i][j]);
		
		}
	}
	}
	}

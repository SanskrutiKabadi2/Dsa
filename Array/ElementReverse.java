import java.util.*;
class ReverseElement{
        public static void main(String[] args){
                int size;
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter size of array:");
                size=Sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter Elements of array:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Sc.nextInt();
                }
		 System.out.println("Reversed Elements of array:");

                for(int i=0;i<arr.length;i++){
                         int sum=0;
                         int N=arr[i];
                         while(N!=0){
                                int rem=N%10;
				sum=(sum*10)+rem;
                                N=N/10;

                          }
                         System.out.println(sum);
                }

        }



}




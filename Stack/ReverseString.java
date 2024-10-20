import java.util.*;
class ReverseString{
	String revStr(String str){
		Stack<Character> st=new Stack<Character>();
		char revArr[]=new char[str.length()];
		for(int i=0;i<str.length();i++){
			st.push(str.charAt(i));
		
		}
		int i=0;
		while(!st.empty()){
			revArr[i]=st.pop();
			i++;
		
		}
		return new String(revArr);
	
	
	}

}
class Client2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string you want to reverse :");
		String str=sc.next();
		ReverseString rs=new ReverseString();
		String rev=rs.revStr(str);
		System.out.println("Reverse String:");
		System.out.println(rev);
	}











}

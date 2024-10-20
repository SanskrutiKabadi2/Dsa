import java.util.*;
class BalancedParanthesis{
	boolean checkBalanced(String str){
		Stack<Character> s=new Stack<Character>();
		for(int i=0;i<str.length();i++){
			char x=str.charAt(i);
			if(x=='(' || x=='{' || x=='['){
				s.push(x);
			}
			else{
				if(!s.empty()){
					char ch=s.peek();
					if((ch=='(' && x==')') ||( ch=='[' && x==']') || (ch=='{' && x=='}')){
						s.pop();
				        }
					else{
						return false;
					}
				}
				else{
					return false;
				}
			}
		
		}
		if(s.empty())
			return true;
		else{
			return false;
		}
	}
}
class Client5{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		BalancedParanthesis bp=new  BalancedParanthesis();
		boolean ret=bp.checkBalanced(str);
		if(ret==true){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Not Balanced");
		}
	}
}

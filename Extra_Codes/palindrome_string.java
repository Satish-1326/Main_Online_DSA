import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a string to check : ");
	String s = sc.next();
	String main = s;
	int n = s.length();
	String reverse = "";
	
	for(int i = n - 1 ; i >= 0 ; i--){
		reverse = reverse+s.charAt(i);
		}

	if(s.equals(reverse)){
		System.out.print("String is palindromic...");
		}
	else{
		System.out.print("String is not palindromic...");
		}
	}
}

/*

OUTPUT :

Enter a string to check : abba
String is palindromic...

*/
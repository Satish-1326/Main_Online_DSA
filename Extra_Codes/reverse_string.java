import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a string to reverse : ");
	String s = sc.next();
	int n = s.length();
	String reverse = "";

	for(int i = n - 1 ; i >= 0 ; i--){
		reverse = reverse+s.charAt(i);
		}

	System.out.print("Reveresed string : "+reverse);
	}
}

/*

OUTPUT :

Enter a string to reverse : aabb
Reveresed string : bbaa

*/
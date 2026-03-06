import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number to check palindrome : ");
	int n = sc.nextInt();
	int original = n;
	int reverse = 0;
	
	while(n != 0){
		int digit = n % 10;
		reverse = reverse*10+digit;
		n = n / 10;
		}

	if(original == reverse){
		System.out.print("Palindrome");
		}
	else{
		System.out.print("Not Palindrome");
		}
	}
}

/*

OUTPUT :

Enter number to check palindrome : 123
Not Palindrome

*/
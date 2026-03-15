import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to check palindrome : ");
	int n = sc.nextInt();
	int original = n ;
	int reverse = 0;

	while(n != 0){
		int digit = n % 10;
		reverse = reverse*10+digit;
		n = n / 10;
		}

	if(original == reverse){
		System.out.print("Number is palindrome...");
		}
	else{
		System.out.print("Number is not palindrome...");
		}
	}
}

/*

OUTPUT :

Enter a number to check palindrome : 141
Number is palindrome...

*/
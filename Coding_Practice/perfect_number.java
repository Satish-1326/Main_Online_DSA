import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();

	int original = n;

	int sum = 0;

	while(n != 0){
		int digit = n % 10;
		sum += digit;
		n = n / 10;
		}

	if(sum == original){
		System.out.print("");
		}
	}
}
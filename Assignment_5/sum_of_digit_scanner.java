import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number to calculate the sum : ");
	int n = sc.nextInt();

	int sum = 0;

	while(n != 0){
		int digit = n % 10;
		sum += digit;
		n = n / 10;
		}
	System.out.print("Sum of digits from a number : "+sum);
	}	
}

/*

OUTPUT :

Enter the number to calculate the sum : 7894
Sum of digits from a number : 28

*/
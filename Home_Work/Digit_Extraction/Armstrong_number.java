import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to check Armstrong number : ");
		int n = sc.nextInt();
		int sum = 0;
		int original = n;

		while(n != 0){
			int digit = n % 10;
			sum += (digit*digit*digit);
			n = n / 10;
		}
	
	if(sum == original){
		System.out.print("A number is Armstrong");
		}
	else{
		System.out.print("A number is not Armstrong");
		}
	}
}

/*

OUTPUT :

Enter a number to check Armstrong number : 153
A number is Armstrong

*/
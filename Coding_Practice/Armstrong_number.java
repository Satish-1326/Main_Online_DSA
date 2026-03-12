import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();

	int original = n;
	int cube = 0;
	int sum = 0;
	
	while(n != 0){
		int digit = n % 10;
		cube = (digit*digit*digit);
		sum += cube;
		n = n /10;
		}
	if(sum == original){
		System.out.print("number is Armstrong");
		}
	else{
		System.out.print("number is not Armstrong");
		}
	}
}

/*

OUTPUT :

Enter a number : 153
number is Armstrong

*/
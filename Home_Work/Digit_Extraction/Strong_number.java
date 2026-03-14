import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to check strong : ");
	int n = sc.nextInt();
	int original = n;
	int sum = 0 ;
	

	while(n != 0){
		int digit = n % 10;
		int mul = 1;

		for(int i = 1 ; i <= digit ; i++){
			mul *= i;
		}

		sum += mul;
		n = n / 10;

		}
	

		if(sum == original){
			System.out.print("Number is strong ");
		}
		else{
			System.out.print("Number is not strong ");
		}
	}
}

/*

OUTPUT :

Enter a number to check strong : 145
Number is strong

*/
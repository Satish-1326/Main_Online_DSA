import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number to find gcd : ");
	int a = sc.nextInt();

	System.out.print("Enter second number to find gcd : ");
	int b = sc.nextInt();

	int gcd = 1;

	for(int i = 1 ; i<= Math.min(a,b) ; i++){
		if(a%i == 0 && b%i == 0){
			gcd = i;
			}
		}
	System.out.print("Greatest Common Divisor (GCD) of two numbers : "+gcd);
	}
}

/*

OUTPUT :

Enter first number to find gcd : 12
Enter second number to find gcd : 18
Greatest Common Divisor (GCD) of two numbers : 6

*/
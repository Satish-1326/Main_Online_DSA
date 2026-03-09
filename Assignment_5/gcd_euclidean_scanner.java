import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number to find gcd : ");
	int a = sc.nextInt();

	System.out.print("Enter second number to find gcd : ");
	int b = sc.nextInt();

	int gcd = 1;

	while(a != 0 && b != 0){
		if(a > b){
			a = a % b;
			}
		else{
			b = b % a;
			}
		}
	if(a == 0){
		gcd = b;
		}
	else{
		gcd = a;
		}
	System.out.print("GCD using the Euclidean Algorithm : "+ gcd);
	}
}

/*

OUTPUT :

Enter first number to find gcd : 48
Enter second number to find gcd : 18
GCD using the Euclidean Algorithm : 6

*/
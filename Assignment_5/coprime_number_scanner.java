import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number to check coprime : ");
	int a = sc.nextInt();

	System.out.print("Enter first number to check coprime : ");
	int b = sc.nextInt();

	int gcd = 0;

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

	if(gcd == 1){
		System.out.print("numbers are coprime : "+gcd);
		}
	else{
		System.out.print("numbers are not a coprime : "+gcd);
		}
	}
}

/*

OUTPUT :

Enter first number to check coprime : 8
Enter first number to check coprime : 15
numbers are coprime : 1

*/
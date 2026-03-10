import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number : ");
	int a = sc.nextInt();

	System.out.print("Enter a second number : ");
	int b = sc.nextInt();

	int GCD = 0;

	while(a != 0 && b != 0){
		if(a > b){
			a = a % b;
			}
		else{
			b = b % a;
			}
		}

	if(a == 0){
		GCD = b;
		}
	else{
		GCD = a;
		}

	System.out.print("This is the gratest common divisor : "+GCD);
	}
}

/*

OUTPUT :

Enter a first number : 12
Enter a second number : 18
This is the gratest common divisor : 6

*/
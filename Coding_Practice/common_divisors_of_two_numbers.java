import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number to find the greatest divisor : ");
	int a = sc.nextInt();

	System.out.print("Enter a second number to find the greatest divisor : ");
	int b = sc.nextInt(); 

	int common = 0;

	for(int i = 1 ; i <= Math.min(a,b); i++){
		if(a % i == 0 && b % i == 0){
			common = i;
			}
		}
	System.out.print("The commn divisor of two numbers are : "+common);
	}
}

/*

OUTPUT :

Enter a first number to find the greatest divisor : 12
Enter a second number to find the greatest divisor : 18
The commn divisor of two numbers are : 6

*/
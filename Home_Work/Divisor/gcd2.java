import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the First Number : ");
	int first_num = sc.nextInt();

	System.out.print("Enter the Second Number : ");
	int second_num = sc.nextInt();

	int gcd = 0;

	for(int i = 1 ; i <= Math.min(first_num , second_num); i++){
		if(first_num % i == 0 && second_num % i == 0){
			gcd = i ;
			}
		}
	System.out.print("Greated common divisor of two number : "+gcd);
	}
}

/*

OUTPUT :

Enter the First Number : 78
Enter the Second Number : 90
Greated common divisor of two number : 6


Time Complexity : O(n)
Space Complexity : O(1)

*/
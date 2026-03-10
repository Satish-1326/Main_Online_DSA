import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to find sum of its divisors : ");
	int n = sc.nextInt();

	int sum = 0;

	for(int i = 1 ; i <= n ; i++){
		if(n % i == 0){
			sum = sum + i;
			}
		}
	System.out.print("This is the sum of its divisors : "+sum);
	}
}

/*

OUTPUT :

Enter a number to find sum of its divisors : 12
This is the sum of its divisors : 28

*/
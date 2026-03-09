import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number to check is prime of not : ");
	int n = sc.nextInt();

	int count = 0;

	for(int i = 1 ; i<= Math.sqrt(n) ; i++){
		if(n % i == 0){
			count++;
			if(i != n / i){
			count++;
				}
			}
		}
	if(count == 2){
		System.out.print("Given number is prime");
		}
	else{
		System.out.print("Given number is not a prime");
		}
	}
}

/*

OUTPUT :

Enter number to check is prime of not : 9
Given number is not a prime

*/
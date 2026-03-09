import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number to check armstrong : ");
	int n = sc.nextInt();
	
	int sum = 0;
	int original = n;

	while(n != 0){
		int digit = n % 10;
		sum = sum+(digit*digit*digit);
		n = n / 10;
		}

	if(original == sum){
		System.out.print("Armstrong Number");
		}
	else{
		System.out.print("Not A Armstrong Number");
		}
	}
}

/*

OUTPUT :

Enter the number to check armstrong : 153
Armstrong Number

*/
import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to check : ");
	int n = sc.nextInt();
	int sum = 0;
	int original = n;
	
	while(n != 0){
		int digit = n % 10;
		sum += digit;
		n = n / 10;
		}
	System.out.println(sum);

	if(original % sum == 0){
		System.out.print("Harshad Number");
		}
	else{
		System.out.print("Not Harshad");
		}
	}
}
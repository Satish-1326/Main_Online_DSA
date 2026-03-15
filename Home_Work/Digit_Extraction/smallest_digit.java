import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to find smalles : ");
	int n = sc.nextInt();
	int small = Integer.MAX_VALUE;

	while(n != 0){
		int digit = n % 10;
		if(digit < small){
			small = digit;
			}
		n = n / 10;
		}
	System.out.print("Smallest digit from the given number : "+small);
	}
}

/*

OUTPUT :

Enter a number to find smalles : 846
Smallest digit from the given number : 4

*/
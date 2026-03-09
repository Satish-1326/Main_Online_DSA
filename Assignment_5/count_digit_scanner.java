import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to count a digits : ");
	int n = sc.nextInt();

	int count = 0;

	while(n != 0){
		int digit = n % 10;
		count++;
		n = n / 10;
		}
	System.out.print("Total digits in the number : "+count);
	}
}

/*

OUTPUT :

Enter a number to count a digits : 6589
Total digits in the number : 4	

*/
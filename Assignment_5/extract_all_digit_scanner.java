import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number to extract digits : ");
	int n = sc.nextInt();

	System.out.print("Extracted digits from number : ");
	System.out.println();
	while(n != 0){
		int digit = n % 10;
		System.out.println(digit);
		n = n / 10;
		}
	}
}

/*

OUTPUT :

Enter the number to extract digits : 67807
Extracted digits from number :
7
0
8
7
6

*/
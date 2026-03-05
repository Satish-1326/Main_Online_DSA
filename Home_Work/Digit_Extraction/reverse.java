import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number to do a reverse : ");
	int n = sc.nextInt();
	int reverse = 0 ;

	while(n != 0){
		int digit = n % 10;
		reverse = reverse*10+digit ;
		n = n / 10 ;
		}
	System.out.print("Reversed Number : "+reverse);
	}
}

/*

OUTPUT :

Enter number to do a reverse : 5679
Reversed Number : 9765

*/
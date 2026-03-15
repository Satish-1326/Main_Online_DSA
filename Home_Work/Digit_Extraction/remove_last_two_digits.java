import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to get a last two digit : ");
	int n = sc.nextInt();
	int digit = n % 100;
	System.out.print("Last two digits from number are : "+digit);
	}
}

/*

OUTPUT :

Enter a number to get a last two digit : 1726
Last two digits from number are : 26

*/
import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number : ");
	String s1 = sc.next();
	System.out.print("Enter second number : ");
	String s2 = sc.next();

	int num1 = Integer.parseInt(s1);
	int num2 = Integer.parseInt(s2);

	int result = num1 + num2;

	//int final = Integer.toString(result);

	System.out.print("Final result after calculation : "+result);
	}
}

/*

OUTPUT :

415_Add_Strings.java

*/
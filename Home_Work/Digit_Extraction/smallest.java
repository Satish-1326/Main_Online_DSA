import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number : ");
	int a = sc.nextInt();

	System.out.print("Enter a second number : ");
	int b = sc.nextInt();

	int small = Integer.MAX_VALUE;

	for(int i = 1 ; i <= Math.min(a,b) ; i++){
		if(a % i == 0 && b % i == 0){
			if(i < small && i != 1){
				small = i;
				}
			}
		}
	System.out.print("Smallest divisor except 1 : "+small);
	}
}

/*

OUTPUT :

Enter a first number : 70
Enter a second number : 40
Smallest divisor except 1 : 2

*/
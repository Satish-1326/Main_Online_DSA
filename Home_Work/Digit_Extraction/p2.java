import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	
	
	while(n != 0){
		int digit = n% 10;
		System.out.print(digit+" ");
		n = n / 10;
		}
	}
}

/*

OUTPUT :

Enter a number : 1006
6 0 0 1

TIME COMPLEXITY : O(log n)
SPACE COMPLEXITY : O(1)

*/
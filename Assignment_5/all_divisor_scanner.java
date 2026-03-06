import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number to find the all divisor : ");
	int n = sc.nextInt();

	for(int i = 1 ; i <= Math.sqrt(n) ; i++){
		if(n % i == 0){
			System.out.print(i+" ");
			System.out.print(n / i+" ");
			}
		}
	}
}

/*

OUTPUT :

Enter a number to find the all divisor : 12
1 12 2 6 3 4

*/
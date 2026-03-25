import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Number : ");
	int n = sc.nextInt();
	int result = fun(n);
	System.out.print("Final tribonacchi : "+result);
	}

	static int fun(int n){
		if(n == 0 || n == 1){
			return n;
		}

	int a = 0 ;
	int b = 1;
	int c = 1;

	for(int i = 3 ; i<= n ; i++){
		int d = a+b+c;
		a = b;
		b = c;
		c = d;
		}
	return c;
	}
}

/*

OUTPUT :

Enter Number : 25
Final tribonacchi : 1389537

*/
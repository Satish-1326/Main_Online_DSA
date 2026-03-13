import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a value to find the fibonacchi : ");
	int n = sc.nextInt();
	int result = fun(n);
	System.out.print(result);
	}

	static int fun(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
	int last = fun(n - 1);
	int s_last = fun(n - 2);
	return last + s_last;
	}
}
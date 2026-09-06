class Demo{
	public static void main(String [] args){
	
	int n = 10;
	System.out.print(fun(n));
	}

	public static int fun(int n){
	
	if(n == 0){
		return 0;
		}
	if(n == 1){
		return 1;
		}

	int last = fun(n-1);
	int second_last = fun(n - 2);

	return last + second_last;
	}
}

/*

FIB USING RECURSSION:

*/
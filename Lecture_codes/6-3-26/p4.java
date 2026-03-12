class Demo{
	public static void main(String[]args){

	int n = 4;
	int result = fun(n);
	System.out.println(result);
	}

	static int fun (int n){
		if(n == 0){
			System.out.println(last);
			System.out.println(s_last);
			return 0;
		}
		if(n == 1){
			return 1;
		}
	int last = fun(n-1);
	int s_last = fun(n-2);
	return last+s_last;
	}
}
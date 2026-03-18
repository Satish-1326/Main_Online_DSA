class Demo{
	public static void main(String[]args){

	int n = 2;
	fun(n);
	}
	
	static void fun(int n){
		if(n == 0){
			return;
		}

	fun(n-1);
	System.out.println(n*n);
	fun(n-1);
	}
}

/*

OUTPUT :

1
4
1

*/
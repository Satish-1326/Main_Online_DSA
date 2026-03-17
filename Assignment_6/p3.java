class Demo{
	public static void main(String[]args){

	int n = 4;
	fun(n);
	}

	static void fun(int n){
		if(n <= 1){
			System.out.println(n);
			return;
		}

	fun(n-2);
	System.out.println(n);
	fun(n-2);
	}
}

/*

OUTPUT :

0
2
0
4
0
2
0

*/
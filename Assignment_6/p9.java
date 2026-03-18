class Demo{
	public static void main(String[]args){

	int n = 3;
	fun(n);
	}

	static void fun(int n){
		if(n <= 1){
			System.out.println(n);
			return;
		}
	fun(n-1);
	System.out.println(n);
	fun(n-2);
	}
}


/*

OUTPUT :

1
2
0
3
1

*/
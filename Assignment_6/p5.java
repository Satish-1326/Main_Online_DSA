class Demo{
	public static void main(String[]args){
	
	int n = 5;
	fun(n);
	}

	static void fun(int n){
		if(n <= 0){
			return;
		}
	System.out.println(n);
	fun(n-2);
	System.out.println(n);
	}
}

/*

OUTPUT :

5
3
1
1
3
5

*/
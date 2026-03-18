class Demo{
	public static void main(String[]args){

	int n=4;
	fun(n);
	}
	
	static void fun(int n){
		if(n <= 0){
			return ;
		}
	fun(n-1);
	fun(n-2);
	}
}

/*

OUTPUT :

TOTAL FUNCTION CALLS = 15

*/
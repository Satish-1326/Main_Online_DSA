class Demo{
	public static void main(String[]args){

	int n = 3;
	fun(n);
	}

	static void fun(int n){
		if(n <= 0){
			return;
		}
	System.out.println("A "+n);
	fun(n-1);
	System.out.println("B "+(n*2));
	}
}

/*

OUTPUT :

A 3
A 2
A 1
B 2
B 4
B 6

*/
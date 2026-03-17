class Demo{
	public static void main(String[]args){

	int n = 2;
	fun(n);
	}
	
	static void fun(int n){
		if(n == 0){
			return;
		}

	System.out.println("x");
	fun(n-1);
	System.out.println("y");
	fun(n-1);
	}
}

/*

OUTPUT:

x
x
y
y
x
y


*/
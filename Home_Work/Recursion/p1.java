class Demo{
	public static void main(String[]args){

	fun();
	}
	static int n  4;

	static void fun(){
		if(n > 4){
			return;
		}
	System.out.print(n);
	n = n - 1;
	fun();
	}
}

/*

OUTPUT :

1
2
3
4

printing 1 to n using recurssion 

*/
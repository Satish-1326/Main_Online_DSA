class Demo{
	public static void main(String[]args){
	
	fun();
	}
	
	static int n = 4;
	static void fun(){
		if(n < 1){
			return ;
		}
	n = n - 1;
	System.out.println(n);
	fun();
	}
}

/*

OUTPUT :

3
2
1
0

printing n to 1 using recursion 

*/
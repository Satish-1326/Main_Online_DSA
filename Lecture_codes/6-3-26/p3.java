class Demo{
	public static void main(String[]args){

	int n = 4;
	fun(n);
	}

	static void fun(int n){
		System.out.println(n);
		if(n < 1){
			return ;
		}
	int val = n - 1;
	fun(val);
	}
}

/*52

OUTPUT :

4
3
2
1
0

*/

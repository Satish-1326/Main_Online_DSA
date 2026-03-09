class Demo{
	public static void main(String[]args){
	
	int n = 3;
	fun(3,3);
	}

	static void fun(int i , int n){
		if(i < 1){
			return;
		}
	System.out.println(i);
	fun(i-1,n);
	}
}
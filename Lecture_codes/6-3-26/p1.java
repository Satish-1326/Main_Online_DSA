class Demo{
	public static void main(String[]args){
		fun();
	}
	static int n = 1;

	static void fun(){
		if(n > 4){
			return;
		}
	System.out.println(n);
	n = n+1;
	fun();
	}
}
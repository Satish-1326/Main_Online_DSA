class Demo{
	public static void main(String[]args){

	int n = 12345;
	int original = n ;
	int reverse = 0;

	while(n != 0){
		int digit = n % 10;
		reverse = reverse*10+digit;
		n = n / 10;
		}
	System.out.print("Original Number : "+original);
	System.out.println();
	System.out.print("Reversed Number : "+reverse);
	}
}

/*

OUTPUT :

Original Number : 12345
Reversed Number : 54321

*/
class Demo{
	public static void main(String[]args){
	
	int n = 543;
	int sum = 0;

	while(n != 0){
		int digit = n % 10;
		sum = sum + digit;
		n = n / 10;
		}
	System.out.print("Sum of digits : "+sum);
	}
}

/*

OUTPUT :

Sum of digits : 12

*/
class Demo{
	public static void main(String[]args){
	
	int n = 43734;
	int original = n ;
	int reverse = 0 ;

		while(n != 0){
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}

		if(reverse == original){
			System.out.print(true+" : Number is palindrome");
		}else{
			System.out.print(false+" : Number is not palindrome");
		}
	}
}

/*

OUTPUT :

true : Number is palindrome

*/
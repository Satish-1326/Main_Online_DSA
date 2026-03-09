class Demo{
	public static void main(String[]args){

	int n = 43734;
	int original = n ; 
	int reverse = 0 ;

	while(n != 0 ){
		int digit = n % 10;
		reverse = reverse*10+digit;
		n = n / 10;
		}
	
	if(original == reverse){
		System.out.print(original+": Given Number is Palindrome");
		}
	else{
		System.out.print("Given Number is Not a Palindrome");
		}
	}
}

/*

OUTPUT :

Enter number to do a reverse : 5679
Reversed Number : 9765

*/
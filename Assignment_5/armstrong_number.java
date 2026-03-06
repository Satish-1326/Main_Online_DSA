class Demo{
	public static void main(String[]args){
	
	int n = 153;
	int original = n;
	int sum = 0 ;

	while(n != 0){
		int digit = n % 10;
		sum = sum + (digit*digit*digit);
		n = n / 10;
		}
	if(original == sum){
		System.out.print("Armstrong Number");
		}
	else{
		System.out.print("Not Armstrong Number");
		}
	}
}

/*

OUTPUT :

Armstrong Number

*/
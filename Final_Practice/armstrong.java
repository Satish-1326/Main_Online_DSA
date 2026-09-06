class Demo{
	public static void main(String [] args){

	int n = 153;
	int original = n;
	int sum = 0;

	int digits = String.valueOf(n).length();

	while(n != 0){
		int digit = n % 10;
		sum = sum +(int)Math.pow(digit, digits);
		n = n / 10;
		}

	if(sum == original){
		System.out.print("Armstrong Number...");
		}
	else{
		System.out.print("Not a armstrong Number...");
		}
	}
}
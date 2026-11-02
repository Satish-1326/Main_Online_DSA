class Demo{
	public static void main(String[]args){

	int n = 7;

	if(n <= 1){
		System.out.print("Given number is not a prime");
		}else{
			boolean isPrime = true;
			for(int i = 2 ; i <= Math.sqrt(n); i++){
				if(n%i == 0){
					isPrime = false;
					break;
				}
			}
		if(isPrime){
			System.out.print("Number is prime...");
			}else{
				System.out.print("Number is not prime...");
			}
		}
	}
}
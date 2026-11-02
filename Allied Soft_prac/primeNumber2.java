class Demo{
	public static void main(String[]args){

	int n = 20;

	for(int num = 2; num <= n; num++){
		
		boolean isPrime = true;

		for(int i = 2 ; i <= Math.sqrt(num); i++){
			if(num%i == 0){
				isPrime = false;
				break;
				}
			}
	if(isPrime){
		System.out.print(num+" ");
			}
		}
	}
}

/*

OUTPUT : 2 3 5 7 11 13 17 19

*/
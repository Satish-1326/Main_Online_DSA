class Demo{
	public static void main(String[]args){
	
	int n = 7;
	int count = 0;

	for(int i = 1 ; i <= Math.sqrt(n) ; i++){
		if(n % i == 0){
			count++;
			if(i != n / i){
				count++;
				}
			}
		}
	if(count == 2){
		System.out.print("Number is prime");
		}
	else{
		System.out.print("Number is not a prime");
		}
	}
}

/*

OUTPUT :

Number is prime

*/
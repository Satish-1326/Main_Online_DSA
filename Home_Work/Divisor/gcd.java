class Demo{
	public static void main(String[]args){
	
	int a = 20 ; 
	int b = 28 ;
	int gcd = 0 ;
	for(int i = 1 ; i <= Math.min(a,b) ; i++){
		if( a%i == 0 && b%i == 0){
			gcd = i;
			}
		} 
	System.out.print("Greatest common divisor of two numbers : "+gcd);
	}	
}

/*

OUTPUT :

Greatest common divisor of two numbers : 4

*/
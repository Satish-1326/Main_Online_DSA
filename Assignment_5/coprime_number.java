class Demo{
	public static void main(String[]args){

	int a = 8 ;
	int b = 5 ;
	int gcd = 1;

	while(a != 0 && b != 0){
		if(a > b){
			a = a % b;
			}
		else{
			b = b % a;
			}
		}
	if(a == 0){
		gcd = b ;
		}
	else{
		gcd = a;
		}

	if(gcd == 1){
		System.out.print("numbers are coprime : "+gcd);
		}
	}
}

/*

OUTPUT :

numbers are coprime : 1

*/
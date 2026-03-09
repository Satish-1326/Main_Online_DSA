class Demo{
	public static void main(String[]args){

	int a = 20;
	int b = 15 ;
	int gcd = 0;

	while(a != 0 && b != 0){
		if(a > b){
			a = a % b;
			}
		else{
			b = b % a;
			}
		}
	if(a == 0){
		gcd = b;
		}
	else{
		gcd = a;
		}
	System.out.print("GCD using euclidean algorithm : "+gcd);
	}
}
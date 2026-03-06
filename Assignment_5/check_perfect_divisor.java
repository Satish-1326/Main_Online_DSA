class Demo{
	public static void main(String[]args){
	
	int n =6;
	int sum = 0;

	for(int i = 1 ; i <= n/2; i++){
		if(n % i == 0){
			sum += i;
			}
		}
	
	System.out.println(sum);

	if(sum == n){
		System.out.print("Perfect Number");
		}
	else{
		System.out.print("Not Perfect Number");
		}
	}
}

/*

OUTPUT :

Perfect Number

*/
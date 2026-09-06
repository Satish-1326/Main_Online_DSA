class Demo{
	public static void main(String [] args){

	int n = 28;
	int sum = 0;

	for(int i = 1 ; i < n ; i++){
		if(n % i == 0){
			sum += i;
			}
		}
	if(sum == n){
		System.out.print("Perfect number...");
		}
	else{
		System.out.print("Not a Perfect Number...");
		}
	}
}
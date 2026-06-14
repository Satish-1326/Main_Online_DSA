class Demo{
	public static void main(String [] args){

	int n = 7;
	int m = 4;

	for(int i = 1 ; i <= m ; i++){
		for(int j = 1 ; j <= m - i ; j++){
			System.out.print("-"+" ");
			}
		for(int j = 1 ; j <= (2*i)-1 ; j++){
			System.out.print("*"+" ");
			}
		System.out.println();
		}
	for(int i = m - 1 ; i >= 1 ; i--){
		for(int j = 1; j <= m - i ; j++){
			System.out.print("-"+" ");
			}
		for(int j = 1 ; j <= (2*i)-1 ; j++){
			System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}
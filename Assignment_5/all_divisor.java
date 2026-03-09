class Demo{
	public static void main(String[]args){
	
	int n = 12;

	for(int i = 1 ; i <= Math.sqrt(n) ; i++){
		if(n % i == 0){
			System.out.print(i+" ");
			System.out.print(n/i+" ");
			}
		}
	}
}

/*

OUTPUT :

1 12 2 6 3 4

*/
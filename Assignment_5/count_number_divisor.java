class Demo{
	public static void main(String[]args){

	int n = 12;
	int count = 0;
	int divisor = 0;

	for(int i = 1 ; i<= Math.sqrt(n) ; i++){
		if(n % i == 0){
			divisor = i;
			count++;
			System.out.print(divisor+" ");
			if(i != n / i){
				divisor = n/i ;
				System.out.print(divisor+" ");
				count++;
				}
			}
		}
	System.out.println();
	System.out.print("Count of all divisor : "+count);
	}
}

/*

OUTPUT :

1 12 2 6 3 4
Count of all divisor : 6

*/

/*

OUTPUT :

Count of all divisor : 6

*/
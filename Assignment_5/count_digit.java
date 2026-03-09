class Demo{
	public static void main(String[]args){

	int n = 54321;
	int count = 0;
	
	while(n != 0){
		int digit = n % 10;
		count++;
		n = n / 10;
		}
	System.out.print("Total digit in the Number : "+count);
	}
}
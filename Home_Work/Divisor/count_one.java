class Demo{
	public static void main(String[]args){
	
	int n = 13;
	int count = 0;
	
	for(int i = 1 ; i <= n ; i++){
		while(i != 0){
			int digit = i % 10;
			if(digit == 1){
				count++;
				}
			i = i / 10;
			}
		} 
	System.out.print(count);
	}
}
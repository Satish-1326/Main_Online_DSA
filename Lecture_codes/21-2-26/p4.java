class Demo{
	public static void main(String[]args){

		boolean check = false;

		for(int i = 1 ; i <= 4 ; i++){
			check =! check ; 
			for(int j = 1 ; j <= 4 ; j++){
				if(check){
					System.out.print(" * ");
					check = false;
				}else{
					System.out.print(" # ");
					check = true;
				}
			}
			System.out.println();
		}
	}
}
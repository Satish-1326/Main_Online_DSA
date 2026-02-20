class Demo{
	public static void main(String[]args){
		
		for(int i = 1 ; i <= 4 ; i++){
			for(int j = 1 ; j <= 5 ; j++){
				if(i >= 2 && i <= 3 && j >= 2 && j <= 4 ){
				System.out.print(" _ ");
				}else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}

/*
OUTPUT :

0 0 0 0 0
0  _  _  _ 0
0  _  _  _ 0
0 0 0 0 0

*/
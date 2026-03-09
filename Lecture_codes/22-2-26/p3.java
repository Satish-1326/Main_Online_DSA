class Demo{
	public static void main(String[]args){
		
		int n = 1 ;
		for(int i = 1 ; i <= 3 ; i++){
			for(int j = 1 ; j <= 3 ; j++){
				
				System.out.print(n +" ");
				n++;
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :
 0  _  _  _  0
 _  0  _  0  _
 _  _  0  _  _
 _  0  _  0  _
 0  _  _  _  0

*/
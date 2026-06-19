class Maximum_Product_of_Three_Numbers{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	int prod = 1;

	for(int i = 0; i < arr.length; i++){
		for(int j = i + 1; j < arr.length; j++){
			for(int k = j + 1; k < arr.length; k++){
				if(arr[i]*arr[j]*arr[k] > prod){
					prod = arr[i]*arr[j]*arr[k];
					}
				}
			}
		}
	System.out.print(prod);
	}
}
class Largest_element_finder_one{
	public static void main(String [] args){

	int [] arr = {5,7,9,1,2,4,13};
	int max = 0;
	
	for(int i = 0 ; i < arr.length ; i++){
		if(arr[i] > max){
			max = arr[i];
			}
		}
	System.out.print("Maximum Element from array : "+max);
	}
}

/*

OUTPUT :

Maximum Element from array : 13

*/
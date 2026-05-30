class Count_Equal_and_Divisible_Pairs_in_an_Array{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	int k = 2;

	int count = 0;

	for(int i = 0 ; i < arr.length ; i++){
		for(int j = i + 1 ; j < arr.length ; j++){
			if(arr[i] == arr[j] && (i * j ) % 2 == 0){
				count++;
				}
			}
		}
	System.out.print(count);
	}
}

class Count_Equal_and_Divisible_Pairs_in_an_Array_app_2{
	public static void main(String[]args){

	int [] arr = {1,2,3,4};
	int k = 0 ;

	int point1 = 0;
	int point2 = point1 + 1 ;

	int count = 0;

	for(int i = point1 ; i < arr.length ; i++){
		if(arr[point1] == arr[point2] && (point1 * point2) % k == 0){
			count++;
			point1++;
			point2++;
			}
		}
	}
}
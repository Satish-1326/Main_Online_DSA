class sub_array_max_sum_one{
	public static void main(String[]args){

	int [] arr = {1,2,-4,3,6,8,-14,-3,-2};
	int max = Integer.MIN_VALUE;

	for(int i = 0 ; i < arr.length ; i++){
		int sum = 0;
		for(int j = i ; j < arr.length ; j++){
			sum = sum + arr[j];
			max = Math.max(sum , max);
			}
		}
	System.out.print(max);
	}
}
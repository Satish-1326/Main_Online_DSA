class Demo{
	public static void main(String[]args){

	int [] arr = {1,1,0,1,1,1,1,1};

	int one = 0;
	int sec = 0;
	int max = 0;
	int count = 1;
	while(sec < arr.length - 1){
		if(arr[one] == 1 && arr[sec] == 1){
			count++;
			sec++;
			}
		if(arr[sec] == 0){
			one = sec+1;
			sec = one;
			max = Math.max(count,max);
			count = 0;
			}
	max = Math.max(count,max);
		}
	System.out.print(max);
	}
}
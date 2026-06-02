class The_Ancient_Temple_Door{
	public static void main(String[]args){

	int n = 7;
	int mid = n / 2;
	for(int i = 0 ; i < n ; i++){
		int sideStar;
		if(i <= mid){
			sideStar = mid - i;
			}
		else{
			sideStar = i - mid;
			}
		int space = n-(2*sideStar);
		for(int j = 0 ; j < sideStar ; j++){
			System.out.print("*"+" ");
			}
		for(int j = 0 ; j < space ; j++){
			System.out.print(" "+" ");
			}
		for(int j = 0 ; j < sideStar ; j++){
			System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}
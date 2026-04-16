class Demo{
	public static void main(String[]args){
		int [] arr = {18,22,20,19,21};
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int left = i - 1;
			int current_element = arr[i];

			while(left >= 0 && arr[left] >= current_element){
				arr[left+1] = arr[left];
				left--;
			}

			arr[left+1] = current_element;
		}

		System.out.print("Sorted array using insertion sort : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

/*

OUTPUT :

Sorted array using insertion sort : 18 19 20 21 22

 */
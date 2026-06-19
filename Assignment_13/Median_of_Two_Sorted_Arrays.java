class Median_of_Two_Sorted_Arrays{
	public static void main(String[]args){

	int [] arr1 = {1,3};
	int [] arr2 = {2};

	double result = medianOfSorted(arr1,arr1);
	System.out.print(result);
	}

	public static double medianOfSorted(int [] arr1,int [] arr2){
	
	int m = arr1.length;
	int n = arr2.length;

	int [] result = new int[m+n];

	int blue = 0;
	int green = 0;
	int red = 0;

	while(blue < m && green < n){
		if(arr1[blue] <= arr2[green]){
			result[red] = arr1[blue];
			red++;
			blue++;
			}
		else{
			result[red] = arr2[green];
			red++;
			green++;
			}
		}
	while(blue < m){
		result[red] = arr1[blue];
		red++;
		blue++;
		}
	while(green < n){
		result[red] = arr2[green];
		red++;
		green++;
		}

	double mid = 0;
	if(result.length % 2 == 1){
		mid = result[result.length /2];
		}
	else{
		mid = (result[result.length / 2-1]+result[result.length / 2]) / 2.0;
		}
	return mid;
	}
}
class Demo{
	public static void main(String[]args){

	String s = "naman";
	boolean palind = true;

	int left = 0;
	int right = s.length()-1;

	while(left < right){
		if(s.charAt(left) != s.charAt(right)){
			palind = false;
			break;
			}
	left++;
	right--;
		}

	if(palind){
		System.out.print("String is palindromic");
		}
	else{
		System.out.print("String is not palindromic...");
		}
	}
}
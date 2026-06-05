class Special_char{
	public static void main(String[]args){

	String s = "Satish@123#";
	int count = 0;

	for(int i = 0; i < s.length(); i++){
		char ch = s.charAt(i);

		if(!(ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z')){
			count++;
			}
		}
	System.out.print(count);
	}
}
class Alphabet_digit_spec_char{
	public static void main(String[]args){

	String s = "Satish@123";
	int alp_count = 0;
	int digit_count = 0;
	int spec_charCount = 0;
	
	for(int i = 0; i < s.length(); i++){
		char ch = s.charAt(i);
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
			alp_count++;
			}
		else if(ch >= '0' && ch <= '9'){
			digit_count++;
			}
		else{
			spec_charCount++;
			}
		}
	System.out.println("Total alphabets : "+alp_count);
	System.out.println("Total digit : "+digit_count);
	System.out.println("Total special character : "+spec_charCount);
	}
}

/*

OUTPUT :

Total alphabets : 6
Total digit : 3
Total special character : 1

*/
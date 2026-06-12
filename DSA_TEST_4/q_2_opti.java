class Demo{
	public static void main(String[]args){
		
	String s = "A man , a plan , a canal: Panama";
	int start = 0;
	int end = s.length()-1;

	boolean result = true;
	while(start < end){
		 if(!(s.charAt(start) >='A' && s.charAt(start) <= 'Z') || !(s.charAt(start) >='a' && s.charAt(start) <= 'z')){
			start++;
			}
		else if(!(s.charAt(end) >='A' && s.charAt(end) <= 'Z') || !(s.charAt(end) >='a' && s.charAt(end) <= 'z')){
			end--;
			}
		else{
			if(!(s.charAt(start) == s.charAt(end)) || !(Math.abs(s.charAt(start) - s.charAt(end)) == 32)){

				result = false;
				break;

			}

		
		}
	}
		
	System.out.print(result);
	}
}
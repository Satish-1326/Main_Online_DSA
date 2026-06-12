import java.util.*;
class Demo{
	public static void main(String[]args){

	String s = "A man , a plan , a canal: Panama";

	String result = "";

	s = s.replace(" ", "");

	String final_r = "";

	for(int i = 0 ; i < s.length(); i++){
		char ch = s.charAt(i);
		if(ch >= 'A' && ch <= 'Z'){
			result += (char)(ch+32);
		}
		else{
			result += ch;
		}
	}

	for(int i = 0 ; i < result.length(); i++){
		char ch = result.charAt(i);
		if(ch >= 'a' && ch <= 'z'){
			final_r += ch;
			}
		}

	int start = 0;
	int end = final_r.length()-1;
	boolean result_end = true;
	while(start < end){
		if(final_r.charAt(start) != final_r.charAt(end)){
			result_end = false;
			break;
			}else{
				start++;
				end--;
			}
		}
	System.out.println(final_r);
	System.out.println(result_end);
	}
}
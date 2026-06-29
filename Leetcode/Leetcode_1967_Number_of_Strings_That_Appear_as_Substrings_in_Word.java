public class Leetcode_1967_Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args){
        String [] patterns = {"a","abc","bc","d"};
        System.out.println(numOfStrings(patterns , "abc"));
    }
    public static int numOfStrings(String [] patterns , String word){
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}

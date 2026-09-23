public class Leetcode_1684_Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args){
        String allowed = "ab";
        String [] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed , String [] words){
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            boolean consitent = true;
            for (int j = 0; j < words[i].length(); j++) {
                if(allowed.indexOf(words[i].charAt(j)) == -1){
                    consitent = false;
                    break;
                }
            }
            if(consitent){
                count++;
            }
        }
        return count;
    }
}

public class Leetcode_2011_Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args){
        String [] operations = {"--X","X++","X++"};

        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String [] operations){

        int x = 0;
        for (int i = 0; i < operations.length; i++) {

            if(operations[i].contains("+")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}

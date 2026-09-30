public class Leetcode_79_Word_Search {
    public static void main(String[] args){
        String word = "ABCCED";

        char [][] board = {{'A','B','C','E'} , {'S' , 'F' , 'C' , 'S'} , {'A', 'D' , 'E' , 'E'}};

        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board , String word){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(helper(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean helper(char[][] board , String word , int i , int j , int ind){
        if(ind == word.length()){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }

        if(board[i][j] != word.charAt(ind)){
            return false;
        }

        char og = board[i][j];
        board[i][j] = '?';

        boolean right = helper(board , word , i , j +1 , ind+1);
        boolean down = helper(board, word, i+1, j, ind+1);
        boolean left = helper(board, word, i, j-1, ind+1);
        boolean up = helper(board, word, i-1, j, ind+1);

        board[i][j] = og;

        if(right || left || up || down){
            return true;
        }
        return false;
    }
}

public class Reverse {
    public static void main(String[] args){
        String s = "java";
        int start = 0;

        char [] arr = s.toCharArray();
        int end = arr.length- 1;
        while (start < end){
            char ch = arr[start];
            arr[start] = arr[end];
            arr[end] = ch;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

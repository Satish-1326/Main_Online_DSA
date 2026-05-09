import java.util.*;
class Demo{
    public static void main(String[] args){
        int n = 7;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                al.add(num);
//                System.out.print(num+" ");
                num = num * (i - j) / (j + 1) ;
            }
            System.out.print(al);
            al.clear();
            System.out.println();
        }
    }
}

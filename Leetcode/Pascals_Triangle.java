import java.util.ArrayList;

public class Pascals_Triangle {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        int n = 30;

            int num = 1;
            for (int j = 0; j <= n; j++) {
                al.add(num);
                num = num * (n - j) / (j + 1);
            }
//            al.add(1);
            System.out.println(al);
    }
}

/*

OUTPUT :
[1, 6, 15, 20, 15, 6, 1]

 */

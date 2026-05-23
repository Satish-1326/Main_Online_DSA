import java.util.Scanner;

public class Leetcode_263_Ugly_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("false");
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 3;
        }

        if (n == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

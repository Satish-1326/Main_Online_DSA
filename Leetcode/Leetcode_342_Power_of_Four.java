public class Leetcode_342_Power_of_Four {
    public static void main(String[] args){
        int n = 16;

        if(n <= 0){
            System.out.println("false");
        }

        while( n % 4 == 0){
            n = n / 4;
        }
        if(n == 1){
            System.out.println("It is a power of four : true");
        }else{
            System.out.println("It is a power of four : false");
        }
    }
}

/*

OUTPUT :

It is a power of four : true

 */

//class Demo1{
//    public static void main(String[] args){
//        int [] arr = {4,3,2,6};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int result = (arr[i] * i);
//            System.out.println(result);
//            sum = sum + result;
//        }
//
//        System.out.println(sum);
//    }
//}

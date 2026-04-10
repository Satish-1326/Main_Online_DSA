class Demo{
    public static void main(String[] args) {
        int num = 10;
        fun(num , 0);
    }
    public static void fun(int num , int count){
        if(count < 10){
            ++count;
            int result = num*count;
            System.out.println(result);
            fun(num,count);
        }
    }
}
class Demo2{
    public static void main(String [] args){
        int n = 5;
        int result = fun2(n);
        System.out.println("Factorial of given number : "+result); //Factorial of given number : 120
    }

    public static int fun2(int n){
        if(n <= 1){
            return 1;
        }
        return n*fun2(n-1);
    }
}
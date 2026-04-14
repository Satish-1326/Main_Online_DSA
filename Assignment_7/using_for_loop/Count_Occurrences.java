public class Count_Occurrences {
    public static void main(String[] args){
        int [] arr = {1,2,2,3,2};
        int target = 2;
        int count = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Count how many times target appears : "+count);
    }
}

/*

OUTPUT :

Count how many times target appears : 3

 */



// Inheritance practice just for fun...

class A{
    A(){
        System.out.println("Hello A");
    }
    void methodA(){
        System.out.println("class A");
    }
}
class B extends A{
    B(){
        System.out.println("Hello B");
    }
    void displayB(){
        System.out.println("class B");
    }
}
class C extends B{
    C(){
        System.out.println("Hello C");
    }
    void methodC(){
        System.out.println("class C");
    }
}
class Main{
    public static void main(String[] args){
        C c = new C();
        c.displayB();
        c.methodA();
        c.methodC();
    }
}
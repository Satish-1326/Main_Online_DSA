public class p1 {
    public static void main(String[]args){

        Satish s = new Satish("Satish",21,78,"Google");

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.sal);
        System.out.println(s.comp_name);
    }
}
class Satish{
    String name;
    int age;
    int sal;
    String comp_name;

    Satish(){}

    Satish(String name, int age, int sal, String comp_name){
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.comp_name = comp_name;
    }
}

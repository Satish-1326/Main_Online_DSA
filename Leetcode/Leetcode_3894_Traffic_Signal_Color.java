public class Leetcode_3894_Traffic_Signal_Color {
    public static void main(String[] args){
        System.out.println(trafficSignal(30));
    }
    public static String trafficSignal(int timer){
        if(timer == 0) return "Green";
        if(timer == 30) return "Orange";
        if(timer > 30 && timer <= 90) return "Red";
        return "Invalid";
    }
}

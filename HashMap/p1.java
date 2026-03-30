import java.util.*;
class Demo{
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm = new HashMap<> ();
//        hm.put(1,"A");
//        hm.put(2,"B");
//        hm.put(3,"C");
//
//        System.out.println(hm); // {1=A, 2=B, 3=C}

        int [] arr = {1,2,1,3,2,1};
        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                hm.put (arr[i] , hm.get(arr[i])+1);
            }else{
                hm.put(arr[i] , 1);
            }
        }
        System.out.println(hm);

        System.out.println("----------------------------------");


        HashMap<Integer , String> hm2 = new HashMap<>();
        hm2.put(1,"A");
        hm2.put(2,"B");

        for(Integer key : hm2.keySet()){
                if(key == 1){
                    hm2.remove(key); // Exception in thread "main" java.util.ConcurrentModificationException
                }
        }
    }
}
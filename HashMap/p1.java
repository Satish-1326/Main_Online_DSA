import java.util.*;
//class Demo{
//    public static void main(String[] args) {
//        HashMap<Integer,Integer>hm = new HashMap<> ();
////        hm.put(1,"A");
////        hm.put(2,"B");
////        hm.put(3,"C");
////
////        System.out.println(hm); // {1=A, 2=B, 3=C}
//
//        int [] arr = {1,2,1,3,2,1};
//        for(int i = 0 ; i < arr.length ; i++){
//            if(hm.containsKey(arr[i])){
//                hm.put (arr[i] , hm.get(arr[i])+1);
//            }else{
//                hm.put(arr[i] , 1);
//            }
//        }
//        System.out.println(hm);
//
//        System.out.println("----------------------------------");
//
//
//        HashMap<Integer , String> hm2 = new HashMap<>();
//        hm2.put(1,"A");
//        hm2.put(2,"B");
//
//        for(Integer key : hm2.keySet()){
//                if(key == 1){
//                    hm2.remove(key); // Exception in thread "main" java.util.ConcurrentModificationException
//                }
//        }
//    }
//}
//class Demo{
//   public static void main(String[] args) {
//        HashMap<Integer,String>hm = new HashMap<>();
//        hm.put(1,"Apple");
//        hm.put(2,"Banana");
//        hm.put(3,"Mango");
//
////       System.out.println(hm);
//       System.out.println(hm.get(1)); // => Apple
//
//       System.out.println(hm.containsKey(2)); // => true
//
//       System.out.println(hm.containsValue("Apple"));
//
//       System.out.println(hm.remove(1)); // =>Apple
//       System.out.println(hm); // =>{2=Banana, 3=Mango}
//
//       System.out.println(hm.size()); // => 2
//
//       System.out.println(hm.put(1,"Apple")); // => null
//       System.out.println(hm); // => {1=Apple, 2=Banana, 3=Mango}
//
//       for(Integer key : hm.keySet()){
//           System.out.println(key + " : " + hm.get(key));
//           /*
//            1 : Apple
//            2 : Banana
//            3 : Mango
//           */
//       }
//    }
//
//}

//class Demo{
//    public static void main(String[] args) {
//        int [] arr = {1,2,1,3,2,1};
//        int f_count = 0;
//
//        for(int i = 0 ; i < arr.length ; i++){
//            int count = 0;
//            for(int j = i + 1 ; j < arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count > Integer.MIN_VALUE){
//                f_count = arr[i];
//            }
//        }
//        System.out.println(f_count);
//    }
//}

//class Demo{
//    public static void main(String[] args) {
//        int [] arr = {1,2,1,3,2,1,3,3,3};
//        int f_count = 0;
//
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            int count = 0;
//            for(int j = i + 1 ; i < arr.length-1 ; i++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count > Integer.MIN_VALUE){
//                f_count = arr[i];
//            }
//        }
//        System.out.println(f_count);
//    }
//}



//class Demo{
//    public static void main(String[] args) {
//        int [] arr = {1,2,1,3,2,1};
//        int f = 0;
//
//        HashMap<Integer,Integer> hm = new HashMap<>();
//
//        for(int i = 0 ; i < arr.length ; i++){
//                hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
//        }
//        for(int i = 0 ; i < arr.length  ; i++){
//            if(hm.get(arr[i]) > Integer.MIN_VALUE){
//                f = arr[i];
//            }
//        }
//        System.out.println(f);
//    }
//}


//class Demo{
//    public static void main(String[]args){
//        int [] arr = {1,2,1,3,2,1};
//        int result = Integer.MAX_VALUE;
//        int f = 0;
//
//        for(int i = 0 ; i < arr.length ; i++){
//            int count = 0;
//            for(int j = 0 ; j < arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count < result){
//                result =count;
//                f = arr[i];
//            }
//        }
//        System.out.println(f);
//    }
//}

//class Demo{
//    public static void main(String[]args){
//        int [] arr = {1,2,1,3,2,1};
//
//        int max = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        int [] freq = new int[max+1];
//        for(int i = 0 ; i < arr.length ; i++){
//            freq[arr[i]]++;
//        }
//        int result = 0;
//        for(int i = 0 ; i < freq.length ; i++){
//            if(freq[i] == 1 ){
//                result = i;
//            }
//        }
//        System.out.println(result);
//    }
//}

//class Demo{
//    public static void main(String[]args){
//        int [] arr = {1,2,1,3,2,1};
//
//        HashMap<Integer,Integer>hm = new HashMap<>();
//        for(int i = 0 ; i < arr.length ; i++){
//            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0 )+1);
//        }
//
//        int ans = -1;
//        int min = Integer.MAX_VALUE;
//        for(int key : hm.keySet()){
//            if(hm.get(key) < min){
//                min = hm.get(key);
//                ans = key;
//            }
//        }
//        System.out.println(ans);
//    }
//}

//class Demo{
//    public static void main(String[]args){
//        int [] arr = {1,2,1,3,2,1};
//        int final_one = 0;
//
//        for(int i = 0 ; i < arr.length ; i++){
//            int count = 0 ;
//            for(int j = 0 ; j < arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count == 1){
//                final_one = arr[i];
//            }
//        }
//        System.out.println(final_one);
//    }
//}

class Demo{
    public static void main(String[]args){
        int [] arr = {1,2,1,3,2,1};

        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        int distinct = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) == 1){
                distinct = key;
            }
        }
        System.out.println(distinct);
    }
}
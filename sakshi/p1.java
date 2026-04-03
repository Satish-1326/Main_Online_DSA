import java.util.*;
class Demo{
    public static void main(String[]args){


        HashMap <String , Integer>hm = new HashMap<>();


//        for(int key : hm.keySet()){
//            hm.getOrDefault(arr[])
//        }

        HashMap<Integer , Integer>map = new HashMap<>();
        int [] arr = {1,2,1,3,2,1};

        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }

//        int max = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length ; i++){
//            int num = arr[i];
//            if(map.get(num) > max){
//                max = num;
//            }
//        }

        int max = 0;
        int result = - 1;
        for (int key : map.keySet()){
            if(map.get(key) > max){
               result = map.get(key);
                max = key;
            }
        }
        System.out.println(max);
        System.out.println(map);

//        System.out.println(hm.isEmpty());

        map.put(1,2);
//        System.out.println(map.isEmpty());


        hm.put("Sakshi" , 90);
        hm.put("ravi" , 85);
        hm.put("girish" , 95);

//        System.out.println(hm);

        hm.put("Sakshi" , 99);
        hm.put("shubham" , 100);

        hm.remove("Sakshi");

//        for(Map.Entry<String,Integer> entry : hm.entrySet()){
////            System.out.println(entry.getKey() + " : " + entry.getValue());
//            if(entry.getValue() != 100){
//                System.out.println(entry.getKey());
//            }
//        }

//        for(String key : hm.keySet()){
//            if(hm.get(key) == 100){
//                System.out.println(key);
//            }
//        }

//        System.out.println(a);

//        System.out.println(hm.size());
//        System.out.println(hm.isEmpty());
//        System.out.println(hm.get("shubham"));

//        System.out.println(hm.containsKey("sakshi"));
//        System.out.println(hm.containsKey("shubham"));
//        System.out.println(hm);
//        int max = 0;
//        for(String key : hm.keySet()){
//            System.out.println(key + ":" + hm.get(key));
//        }


    }
}

class solution{
        public static void main(String[]args){
            String str = "apple";
            int [] freq = new int[256];

            for(int i = 0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                    freq[ch]++;
            }

//            int max = 0;
            for(int i = 0 ; i < freq.length; i++){
                if(freq[i] > 0) {
                    System.out.println((char) i + "  " + freq[i]);
                }
            }
        }
}
/*
a  1
e  1
l  1
p  2
*/



class Hash{
    public static void main(String[]args){
        String str = "apple";
        HashMap <Character,Integer> char_freq = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            char_freq.put(ch, char_freq.getOrDefault(ch, 0 ) + 1);
        }
        for(Character key : char_freq.keySet()){
            System.out.println(key + " : " + char_freq.get(key));
        }
    }
}
/*
p : 2
a : 1
e : 1
l : 1
 */

class Leetcode347{
    public static void main(String[]args){
        int [] nums = {3,3,3,2,2,1,1};
        int k = 2;
        int [] arr = new int[k];

        HashMap <Integer , Integer>hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }

        int i = 0;
        for(int key : hm.keySet()){
            if(i < k){
                arr[i] = key;
                i++;
            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            System.out.println(arr[j]);
        }
    }
}
/*
1
2
 */


class String_pract{
    public static void main(String[] args){
        String str = "apple";

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch +" : "+ count);
        }
    }
}

class String_freq_aaproacah_Second{
    public static void main(String[] args){
        String str = "apple";
        int [] freq = new int[26];

        for(int i = 0 ; i < str.length() ; i++){
            freq[str.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0){
                char ch = (char)(i+'a');
                System.out.println(ch + " : " + freq[i]);
            }
        }
    }
}

class String_freq_aaproach_Three{
    public static void main(String[] args){
        String str = "apple";

        HashMap<Character , Integer>hm = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for (Character key : hm.keySet()){
            if(hm.get(key) == 1){
                System.out.println(key);
                break;
            }
        }
        System.out.println(hm);
    }
}

class First_non_repeating{
    public static void main(String[] args){
        String str = "apple";
        int [] freq = new int[26];

        for(int i = 0 ; i < str.length() ; i++){
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 1){
                char ch = (char)(i+'a');
                System.out.println(ch);
                break;
            }
        }
    }
}

class First_non_repeating_for_loop{
    public static void main(String[] args){
        String str = "apple";

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0 ; j < str.length() ; j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}

class first_repeating_one{
    public static void main(String[] args){
        int [] arr = {2,3,2,1 , 1};

        for(int i = 0 ; i < arr.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

class first_repeating_two{
    public static void main(String [] args){
        int [] arr = {1,2,1,3,2,1};
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int [] freq = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }

        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 1){
                System.out.println(i);
                break;
            }
        }
    }
}

class first_repeating_three{
    public static void main(String[]args){
        int [] arr = {1,2,1,3,2,1};
        HashMap <Integer,Integer>hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        for(int key : hm.keySet()){
            if(hm.get(key) > 1){
                System.out.println(key);
                break;
            }
        }
    }
}
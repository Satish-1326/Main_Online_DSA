//class Demo{
//    public static void main(String[] args){
//        int [] arr = {7,8,4,10};
//        boolean result = true;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                if(arr[i] <= arr[j]){
//                    result = true;
//                }else{
//                    result = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(result);
//    }
//}

class Demo{
    public static void main(String[] args){
        int [] arr = {7,8,4,10};
        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1]){
                result = true;
            }else{
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
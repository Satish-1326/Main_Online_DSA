public class Search_for_an_element {
    public static void main(String[] args){
        int [] arr = {10, 20, 30, 40};
        int x = 30;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == x){
//                System.out.println(i);
                result = i;
                break;
            }
        }
        System.out.println("Index of target elements : "+result);
    }
}

/*

OUTPUT :

Index of target elements : 2

 */

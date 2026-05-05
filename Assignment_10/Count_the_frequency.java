public class Count_the_frequency {
    public static void main(String[] args){
        int [] arr = {1, 2, 2, 3, 1, 4, 2};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int [] freq = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                System.out.println(i + " : " + freq[i]);
            }
        }
    }
}

/*

OUTPUT :

1 : 2
2 : 3
3 : 1
4 : 1

 */

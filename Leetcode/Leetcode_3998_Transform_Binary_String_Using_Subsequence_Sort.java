import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_3998_Transform_Binary_String_Using_Subsequence_Sort {
    public static void main(String[] args){
        String [] strs = {"1?1","0?1","0?0"};
        System.out.println(Arrays.toString(transformStr("101" , strs)));
    }
    public static boolean[] transformStr(String s, String[] strs) {
        String [] st = strs;

        int n = s.length();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i< n ; i++){
            if(s.charAt(i) == '1'){
                al.add(i);
            }
        }
        int totalOnes = al.size();
        boolean [] ans = new boolean[strs.length];

        for(int i = 0 ; i < strs.length; i++){

            char [] arr = strs[i].toCharArray();

            int fixedOnes = 0;
            ArrayList<Integer> q = new ArrayList<>();

            for(int k = 0 ; k  < n ; k++){
                if(arr[k] == '1'){
                    fixedOnes++;
                }else if(arr[k] == '?'){
                    q.add(k);
                }
            }
            int need = totalOnes - fixedOnes;

            if(need < 0 || need > q.size()){
                ans[i] = false;
                continue;
            }

            for(int j = q.size() - need ; j < q.size(); j++){
                arr[q.get(j)] = '1';
            }
            for(int j = 0 ; j < q.size() - need ; j++){
                arr[q.get(j)] = '0';
            }
            ArrayList<Integer>targetPos = new ArrayList<>();

            for(int p = 0 ; p < n ; p++){
                if(arr[p] == '1'){
                    targetPos.add(p);
                }
            }
            boolean ok = true;

            for(int p = 0 ; p < totalOnes; p++){
                if(targetPos.get(p) < al.get(p)){
                    ok = false;
                    break;
                }
            }
            ans[i] = ok;
        }
        return ans;
    }
}

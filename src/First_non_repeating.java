import java.util.HashMap;
import java.util.Map;

public class First_non_repeating
{
    public static void main(String[] args){
        int[] arr = {-1, 2, -1, 3, 2};
        int n = arr.length;
        int sol = fnr(arr,n);
        System.out.println(sol);
    }
    public static int fnr(int[] arr , int n){
        int sol = -1;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0 ; i<n-1 ; i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i] , m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],i);
            }
        }
        for(Map.Entry<Integer,Integer> x : m.entrySet()){
            if(x.getValue() == 1){
                sol = x.getKey();
            }

        }
        return arr[sol+1];
    }
}

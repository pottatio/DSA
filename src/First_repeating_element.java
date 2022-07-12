import java.util.HashSet;
//Given an array arr[] of size n, find the first repeating element. The element should
// occurs more than once and the index of its first
// occurrence should be the smallest.
public class First_repeating_element
{
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        int sol = fre(arr,n);
        System.out.println(sol);
    }

    public static int fre(int[] arr , int n){
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=n-1 ; i>=0 ; i--)
        {
            if (set.contains(arr[i])) {
                min = i;
            }
            else{
                set.add(arr[i]);
            }
        }
        if(min==-1 ){
            return(-1);
        }
        else{
            return(arr[min]);
        }

    }

}

import java.util.Arrays;
import java.util.ArrayList;
/*Given an array a[] of size N which contains elements from 0 to N-1,
you need to find all the elements occurring more than once in the given array.*/
public class duplicate {
    public static void main(String[] args){
        int[] arr = {2,3,1,2,3};
        ArrayList<Integer> sol = new ArrayList<Integer>();
        ArrayList<Integer> newsol = new ArrayList<Integer>();
        int n = arr.length;
        Arrays.sort(arr); // sort the arr
        /* if the previous element is same as next element.
        add it to the Arraylist sol*/

        for(int i=1 ; i<n ; i++) {
            if (arr[i] == arr[i - 1]) {
                sol.add(arr[i]);
            }
// use newsol to add distinct elements of sol
        for(Integer ele : sol){
            if(!newsol.contains(ele)){
                newsol.add(ele);
            }
        }
        //if newsol is empty add -1 to show it's empty and print newsol
            if(newsol.isEmpty()){
                newsol.add(-1);
            }
            else{
                System.out.println(newsol);
            }
        }
    }

}

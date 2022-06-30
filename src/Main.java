import java.util.Arrays;
// The following program is to find medium of 2 sorted arrays
public class Main {
    public static void main(String[] args){
        int[] nums1  = {1,3};
        int[] nums2 = {2};
        double result = medianofsorted(nums1,nums2);
        System.out.println(result);
    }
    public static double medianofsorted(int[] nums1 , int[] nums2){

        int nums3[] = sortitbitch(nums1 , nums2);
        for(int j=0 ; j<nums3.length ; j++){
            System.out.println(nums3[j]);
        }
        int len = nums3.length;
        int mid = len/2;
        if(len % 2 == 0){
            double x = nums3[mid];
            double y = nums3[mid-1];
            double ans = (x + y)/2;
            return (ans);
        }
        else{
            return(nums3[mid]);
        }

    }
    public static int[] sortitbitch(int[] nums1 , int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] gums = new int[n];
        System.arraycopy(nums1 , 0 , gums , 0 , n1);
        System.arraycopy(nums2 , 0 , gums , n1 , n2);
        Arrays.sort(gums);
        return(gums);
    }
}


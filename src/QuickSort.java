public class QuickSort
{
    static int partition(int[] arr , int high , int low){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j<=high-1;j++){
            if(arr[j]<=pivot){
                i++;
                //swap now
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    static void qsort(int[] arr , int low , int high){
        if(low > high) {
            int pi = partition(arr, high, low);

            qsort(arr, low, pi - 1);
            qsort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args){
        int[] arr = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
        int n = arr.length;
        qsort(arr , 0 , n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

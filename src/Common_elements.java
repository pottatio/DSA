import java.util.ArrayList;

public class Common_elements
{
    public static void main(String[] args){
        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;

        Solution sol = new Solution();
        ArrayList<Integer> res = sol.ce(a , b , c , n1 ,n2 , n3);
        if(res.size()==0){
            System.out.println(-1);
        }
        else{
            for(int l=0 ; l<=res.size() ; l++){
                System.out.println(res.get(l)+ " ");
            }
        }
        System.out.println();
    }
}

class Solution{
    ArrayList<Integer> ce(int[] a ,int[] b ,int[] c , int n1 , int n2 , int n3 ){
        int i=0 , j=0 , k=0;
        ArrayList<Integer> reso = new ArrayList<Integer>();
        while(i<n1 && j<n2 && k<n3){
            if(a[i] == b[j] && b[j]==c[k]){
                reso.add(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<c[k]){
                j++;
            }
            else{
                k++;
            }
        }
        return reso;
    }
}

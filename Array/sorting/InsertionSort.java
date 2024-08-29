package Array.sorting;
import static Basics.SwapElements.swap;
public class InsertionSort {

    public static void insertionSort(int[] ar){
        int n = ar.length;
        for(int i=1;i<n;i++){
            int index = i;
            for(int j=i-1;j>=0;j--){
                if(ar[j]<ar[index])
                    swap(ar,j,index);
                index = j;
            }
        }
    }
}

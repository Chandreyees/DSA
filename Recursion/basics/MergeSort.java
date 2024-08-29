package Recursion.basics;

public class MergeSort {

    public static void mergeSort(int[] ar, int low, int high) {
        if(low>=high)
            return;
        int mid = (low+high)/2;
        mergeSort(ar,low,mid);
        mergeSort(ar,mid+1,high);
        merge(ar,low,mid,high);
    }

    private static void merge(int[] ar, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int[] res = new int[high-low+1];
        int k=0;
        while(left<=mid && right<=high){
            if(ar[left]>ar[right]) {
                res[k] = ar[right];
                right++;
            }
            else {
                res[k]=ar[left];
                left++;
            }
            k++;
        }
        while(left<=mid){
            res[k]=ar[left];
            left++;k++;
        }
        while(right<=high){
            res[k]=ar[right];
            right++;k++;
        }
        for(int i=0;i<res.length;i++) {
            ar[low] = res[i];
            low++;
        }
    }
}

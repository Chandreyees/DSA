package Recursion.basics;
import static Basics.SwapElements.swap;
public class QuickSort {

    public static void quickSort(int[] ar, int start, int end){
        if(start>=end)
            return;
        int pivot = partition(ar,start,end);
        quickSort(ar,start,pivot-1);
        quickSort(ar,pivot+1,end);
    }

    private static int partition(int[] ar, int s, int e) {
        int p = s;
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(ar[i]<=ar[p])
                count++;
        }
        int pivotIndex = s+count;
        swap(ar,s,pivotIndex);
        int i=s,j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(ar[i]<ar[pivotIndex])
                i++;
            while(ar[j]>ar[pivotIndex])
                j--;
            if(ar[i]>ar[pivotIndex] || ar[j]<ar[pivotIndex])
                swap(ar,i,j);
        }
        return pivotIndex;
    }
}

package arrayEasy.Sorting;

import java.util.ArrayList;

public class Sorting {

    public void selectionSort(int[] ar,int n){
        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j=i;j<n;j++){
                if(ar[minIndex]>ar[j])
                    minIndex = j;
            }
            swap(minIndex,i,ar);
        }
    }

    public void bubbleSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(j,j+1,arr);
            }
        }
    }

    public void insertionSort(int[] ar, int n){
        if(n==1)
            return;
        else {
            for (int i = 1; i < n; i++) {
                int temp = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (ar[temp] < ar[j]) {
                        swap(temp, j, ar);
                        temp = j;
                    }
                }
            }
        }
    }
    
    public void mergeSort(int[] arr, int low, int high){
        if(low == high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low, mid);
        mergeSort(arr,mid+1, high);
        merge(arr,low,mid,high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
       int right = mid+1, left =low;
        ArrayList<Integer> temp = new ArrayList<>(high+1);
       while(left<=mid && right<=high){
          if(arr[left]>arr[right]){
              temp.add(arr[right]);
              right++;
          }
          else {
              temp.add(arr[left]);
              left++;
          }
       }
       while(left<=mid){
           temp.add(arr[left]);
           left++;
       }
       while(right<=high){
           temp.add(arr[right]);
           right++;
       }
       for(int i=low;i<=high;i++){
           arr[i] = temp.get(i-low);
       }
    }

    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
        else
            return;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = low;
        int i= low,j=high;
        while(i<j) {
            while(arr[pivot]>=arr[i] && i<=high-1) //finding the first smallest element
                i++;
            while(arr[pivot]<arr[j] && j>=low+1)  //finding the first smallest element
                j--;
            if(i<j)
                swap(i,j,arr);
        }
        swap(j,pivot,arr);
        return j;
    }

    private void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

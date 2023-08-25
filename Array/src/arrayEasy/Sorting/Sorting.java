package arrayEasy.Sorting;

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

    private void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

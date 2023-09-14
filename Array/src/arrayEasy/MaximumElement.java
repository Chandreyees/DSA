package arrayEasy;

public class MaximumElement {

    public int largestElement(int[] arr, int n){
        int max = arr[0];
        for(int i : arr){
            if(max<i)
                max=i;
        }
        return max;
    }

    public int secondLargestElement(int[] arr, int n){
        int secondLargest = -1;
        //better sol
        /*int largest = largestElement(arr,n);
        for (int i =0; i<n; i++){
            if(secondLargest<arr[i] && arr[i]!=largest)
                secondLargest = arr[i];
        }*/
        //optimal sol
        int largest = arr[0];
        for (int i =1;i<n;i++){
            if(largest<arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest<arr[i] && arr[i]<largest)
                secondLargest = arr[i];
        }
        return secondLargest;
    }
}

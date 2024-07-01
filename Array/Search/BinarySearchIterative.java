package Array.Search;

public class BinarySearchIterative {

    public static int binarySearchIterativeIncreasing(int[] ar,int low, int high, int key){
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]==key)
                return mid;
            else if(ar[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static int binarySearchIterativeDecreasing(int[] ar,int low, int high, int key){
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]==key)
                return mid;
            else if(ar[mid]<key)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}

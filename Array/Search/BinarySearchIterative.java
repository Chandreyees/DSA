package Array.Search;

public class BinarySearchIterative {

    public int search(int[] ar,int n, int key){
        int low=0,high=n-1;
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
}

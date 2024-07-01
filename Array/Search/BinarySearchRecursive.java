package Array.Search;

public class BinarySearchRecursive {

    public int search(int[] ar,int low, int high, int key){
        int mid = (low+high)/2;
        if(low>high)
            return -1;
        if(ar[mid]==key)
            return mid;
        else if(ar[mid]<key)
            return search(ar,low,mid-1,key);
        return search(ar,mid+1,high,key);
    }
}

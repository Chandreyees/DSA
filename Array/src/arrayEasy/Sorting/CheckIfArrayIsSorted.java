package arrayEasy.Sorting;

public class CheckIfArrayIsSorted {

    public boolean checkIfArrayIsSorted(int[] arr, int n){
        boolean ans = false;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                ans = true;
            }
            else{
                ans =false;
                break;
            }
        }
        return ans;
    }

}

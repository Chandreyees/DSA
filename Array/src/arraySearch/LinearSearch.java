package arraySearch;

import basicMaths.OperationOnDigits;

public class LinearSearch {

    public boolean isValuePresent(int k,int[] ar){
        if(ar.length==0)
            return false;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==k)
                return true;
        }
        return false;
    }

    //search for even number of digits in each element of an array
    public int searchEvenDigits(int[] ar){
        int ans=0;
        OperationOnDigits operationOnDigits = new OperationOnDigits();
        for(int i=0;i<ar.length;i++)
        {
            if(operationOnDigits.countDigits(ar[i])%2==0)
                ans++;
        }
        return ans;
    }
}

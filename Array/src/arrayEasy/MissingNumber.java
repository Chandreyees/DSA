package arrayEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public int findMissingNumber(int[] nums){
        //NAive
        /*HashMap<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i=0;i<=nums.length;i++){
            map.put(i,0);
        }
        for(int key:nums){
            if(map.containsKey(key))
                map.put(key,map.get(key)+1);
        }
        map.put(nums.length,map.get(nums.length)+1);
        int ans=nums.length;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==0)
                return entry.getKey();
        }
        return ans;*/

        //better
        /*Arrays.sort(nums);
        int i=0,j=i;
        while(i<nums.length){
            j=i;
            if(nums[i]!=j)
                return j;
            i++;
        }
        return j+1;*/

        //optimised
        int sum=0,arrSum=0;
        for(int i=0;i<=nums.length;i++)
            sum+=i;
        for(int i:nums)
            arrSum+=i;
        return sum-arrSum;
    }
}

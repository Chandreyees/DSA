package arrayEasy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {

    int n;

    public FrequencyOfArray(int n){
        this.n=n;
    }

    public void frequencyOfNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int minTemp=Integer.MAX_VALUE,min=0;
        for(int key:arr){
            if(map.containsKey(key))
                map.put(key,map.get(key)+1);
            else
                map.put(key,1);
        }
        int max=0,temp=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<minTemp){
                min= entry.getKey();
                minTemp= entry.getValue();
            }
            else if(entry.getValue()>temp) {
                max = entry.getKey();
                temp = entry.getValue();
            }
        }
        System.out.println("The highest frequency number : "+max+"\n The lowest frequency number is : "+min);
    }

    public int countMajorityElement(int[] nums){
        int n = nums.length/2;
        //better solution
        /*Arrays.sort(nums);
        int k = nums[0], count = 1, i =1;
        while(i<nums.length){
            if(k==nums[i])
                count++;
            else{
                count = 1;
                k = nums[i];
            }
            if(count>n)
                break;
            i++;
        }*/
        //optimal solution
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:nums){
            if(map.containsKey(key))
                map.put(key,map.get(key)+1);
            else
                map.put(key,1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n)
                return entry.getKey();
        }
        return -1;
    }
}

package arrayEasy;

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
}

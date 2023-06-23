package arrayEasy;
import java.lang.reflect.Array;
import java.util.*;
public class TargetArrayInGivenOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		int index[] = new int[n];
		for(int i=0;i<n;i++) 
			nums[i] = sc.nextInt();
		for(int i=0;i<n;i++) 
			index[i] = sc.nextInt();
		int[] target = createTargetArray(nums,index);
		System.out.println(Arrays.toString(target));
	}
	
	 public static int[] createTargetArray(int[] nums, int[] index) {
	        //naive solution
	        // Integer[] target = new Integer[nums.length];
	        // for(int i=0;i<nums.length;i++){
	        //     if(target[index[i]]!=null){
	        //        for(int j=target.length-1;j>index[i];j--)
	        //             target[j] = target[j-1]; 
	        //     }
	        //     target[index[i]]=nums[i];
	        // }
	        // int[] result = Arrays.stream(target).mapToInt(Integer::intValue)
	        //               .toArray();

	        //optimised sol
	        ArrayList<Integer> arr = new ArrayList<>();
	        int[] target = new int[nums.length];
	        for(int i=0; i<nums.length; i++){
	            arr.add(index[i],nums[i]);
	        }
	        for(int i=0; i<arr.size(); i++){
	            target[i]=arr.get(i);
	        }
	        return target;
	    }

}

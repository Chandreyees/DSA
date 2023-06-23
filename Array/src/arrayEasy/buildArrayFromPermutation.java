package arrayEasy;
import java.util.*;

/*Question:Given a zero-based permutation nums(0-indexed),
 * build an array ans of the same length where 
 * ans[i]=nums[nums[i]]for each 0<=i<nums.length and return it.
*/
public class buildArrayFromPermutation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ans = new int[n];
		ans = buildArray(arr);
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}
	
	 public static int[] buildArray(int[] nums) {
	        int[] ans = new int[nums.length];
	        for(int i=0;i<nums.length;i++)
	            ans[i] = nums[nums[i]];
	        return ans;
	    }

}

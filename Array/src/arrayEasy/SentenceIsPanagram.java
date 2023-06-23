package arrayEasy;
import java.util.*;
public class SentenceIsPanagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		boolean ans = checkIfPangram(s);
		System.out.println(ans);
	}
	
	public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[123];
        for(int i=0;i<sentence.length();i++){
            arr[(int)sentence.charAt(i)]++;
        }
        boolean ans = true;
        for(int i=97;i<=122;i++){
            if(arr[i]<1){
                ans=false;
                break;
            }
        }
        return ans;
    }
}

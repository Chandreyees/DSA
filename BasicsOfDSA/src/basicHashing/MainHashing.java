package basicHashing;
import java.util.Scanner;

public class MainHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        DuplicatesInArray ob = new DuplicatesInArray(n);
        boolean flag = true;
        while(flag){
            System.out.println("Enter your choice: ");
            System.out.println("1 for finding duplicate numbers in an array: ");
            System.out.println("2 for finding duplicate characters in an array: ");
            System.out.println("3 for finding duplicate numbers in an array using HashMap");
            int ch = sc.nextInt();
            switch (ch){
                case 1 : {
                    System.out.println("Enter the numbers : ");
                    for(int i=0;i<n;i++)
                        arr[i]=sc.nextInt();
                    ob.findDuplicateNumbers(arr,n);
                    break;
                }
                case 2 : {
                    System.out.println("Enter the characters: ");
                    char[] c = new char[n];
                    for(int i= 0;i<n;i++)
                        c[i] = sc.next().charAt(0);
                    ob.findDuplicateCharacters(c,n);
                    break;
                }

                case 3 : {
                    System.out.println("Enter the numbers : ");
                    for(int i=0;i<n;i++)
                        arr[i]=sc.nextInt();
                    System.out.println(ob.findDuplicatesUsingMap(arr).toString());
                    break;
                }
                default:
                    System.out.println("Wrong Choice!!!!!");
            }
            System.out.println("Do you want to continue: Y/N ? ");
            sc.nextLine();
            String s = sc.nextLine();
            if("N".equalsIgnoreCase(s))
                flag=false;
        }
    }
}
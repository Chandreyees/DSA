
import arrayEasy.FrequencyOfArray;
import arrayEasy.Sorting.Sorting;
import arraySearch.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        boolean flag = true;
        while(flag){
            System.out.println("Enter the array elements : ");
            for(int i=0;i<n;i++)
               arr[i] = sc.nextInt();
            System.out.println("Enter your choice");
            System.out.println("1 for printing the highest and lowest frequency number: ");
            System.out.println("2 for searching for an element: ");
            System.out.println("3 for searching the number of elements that has even no of digits: ");
            System.out.println("4 for selection sorting the array: ");
            System.out.println("5 for bubble sorting the array: ");
            System.out.println("6 for insertion sorting the array: ");
            int ch =sc.nextInt();
            switch (ch){
                case 1 : {
                    FrequencyOfArray ob = new FrequencyOfArray(n);
                    ob.frequencyOfNumber(arr);
                    break;
                }
                case 2 : {
                    LinearSearch lr = new LinearSearch();
                    System.out.println("Enter the number you are searching for: ");
                    int k = sc.nextInt();
                    if(lr.isValuePresent(k,arr))
                        System.out.println("Element is present!!");
                    else
                        System.out.println("No such element is present!!");
                    break;
                }
                case 3 : {
                    LinearSearch lr = new LinearSearch();
                    System.out.println("The number of elements having even digits are : "+lr.searchEvenDigits(arr));
                    break;
                }
                case 4 : {
                    Sorting ob = new Sorting();
                    ob.selectionSort(arr,n);
                    System.out.println("Selection Sorting : "+Arrays.toString(arr));
                    break;
                }
                case 5 : {
                    Sorting ob = new Sorting();
                    ob.bubbleSort(arr,n);
                    System.out.println("Bubble Sorting: "+Arrays.toString(arr));
                    break;
                }
                case 6 : {
                    Sorting ob = new Sorting();
                    ob.insertionSort(arr,n);
                    System.out.println("Insertion Sorting: "+Arrays.toString(arr));
                    break;
                }
                default:
                    System.out.println("Wrong Choice");
            }
            System.out.println("Do you want to continue: Y/N ? ");
            sc.nextLine();
            String s = sc.nextLine();
            if("N".equalsIgnoreCase(s))
                flag=false;
        }
    }
}
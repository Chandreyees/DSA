package Basics;


public class SwapElements {

    public static void swap(int[] ar,int i,int j){
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}

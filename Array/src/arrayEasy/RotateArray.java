package arrayEasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateArray {

    public static void leftRotateArray(int[] arr, int n, int d) {
        /*
        int d= n%d;
        int[] temp= new int[d];
        int k=0;
        for(int i=0;i<d;i++)
            temp[i] = arr[i];
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++,k++)
            arr[i]=temp[k];*/

        //optimal
        if (d == n)
            return;
        ArrayManipulation arrayManipulation = new ArrayManipulation();
        arrayManipulation.reverseArray(arr, 0, d);
        arrayManipulation.reverseArray(arr, d, n);
        arrayManipulation.reverseArray(arr, 0, n);
    }

}

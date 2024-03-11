package arrayEasy;

import java.util.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array1: ");
        int n= sc.nextInt();
        System.out.println("Enter the length of array2: ");
        int m =sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]= new int[m];
        System.out.print("Enter the values of array1: ");
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the values of array2: ");
        for (int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        System.out.println("Enter your choice: ");
        System.out.println("1 for finding intersection of array: ");
        System.out.println("2 for finding union of array: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:{
                System.out.println("Intersection of array1 and array2: "+Arrays.toString(intersectionOfArray(arr1,arr2)));
                break;
            }
            case 2:{
                System.out.println("Union of array1 and array2: "+unionOfArray(arr1,arr2));
                break;
            }
            default:
                System.out.println("Wrong Choice");
        }
    }

    private static ArrayList<Integer> unionOfArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        return ans;
    }

    public static int[] intersectionOfArray(int[] nums1,int[] nums2){
        int[] ans=new int[nums1.length];
        Set<Integer> set = new HashSet<>();
        int k = 0;
        /*Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums2[j]<nums1[i])
                j++;
            else if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
        }*/
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i]))
            map.put(nums1[i],map.get(nums1[i])+1);
            else
                map.put(nums1[i],1);
        }
        for(int key:nums2){
            if(map.containsKey(key))
            map.put(key,map.get(key)+1);
            else
                map.put(key,1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
                ans[k++]=entry.getKey();
        }
        return ans;

    }

    public void reverseArray(int[] arr,int low,int high){
        while(low<high-1){
            swap(low,high-1,arr);
            low++;
            high--;
        }
    }

    private void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveZeroes(int n,int[] arr){
        int j=0;
        //find the first zero and intialize j with that value
        for (int k=0;k<n;k++)
        {
            if(arr[k]==0){
                j=k;
                break;
            }
        }
        //actual logic
        if(j<n) {
            for (int k = j + 1; k < n; k++) {
                if (arr[j] == 0 && arr[k] != 0) {
                    swap(j, k, arr);
                    j++;
                }
            }
        }
    }

    public List<Integer> getUnion(int n,int m, int[] a1,int[] a2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(a1[i]<=a2[j]){
                if(!list.contains(a1[i]))
                    list.add(a1[i]);
                i++;
            }  else {
                if(!list.contains(a2[j]))
                    list.add(a2[j]);
                j++;
            }
        }
        while(i<n){
            if(!list.contains(a1[i]))
                list.add(a1[i]);
            i++;
        }
        while(j<m){
            if(!list.contains(a2[j]))
                list.add(a2[j]);
            j++;
        }
        return list;
    }
}

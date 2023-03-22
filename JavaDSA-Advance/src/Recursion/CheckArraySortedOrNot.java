package Recursion;

import java.util.Scanner;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int SI = 0;
        System.out.println(isSorted(arr,SI));
    }
    public static boolean isSorted(int[] arr, int SI){
        if(SI == arr.length-1){
            return true;
        }
        if (arr[SI] > arr[SI+1]){
            return false;
        }else{
            boolean SmallerIsSorted = isSorted(arr,SI+1);
            return SmallerIsSorted;
        }
    }
}

package TimeAndSpace;

import java.util.Scanner;

public class ArrayElementsAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printReverseArray(reverseArray(arr));
    }
    public static int[] reverseArray(int[] arr){
        for (int i=0; i<arr.length/2; i++){
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
        return arr;
    }
    public static void printReverseArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}

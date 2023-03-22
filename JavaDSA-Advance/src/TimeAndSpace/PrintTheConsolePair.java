package TimeAndSpace;

import java.util.Scanner;

//O(n^2).

public class PrintTheConsolePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printTheConsolePair(arr);  // Function Call.
    }

//    Over all time complexity of this method will be O(n^2).
//    because of inner-loops.
    public static void printTheConsolePair(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i]+""+arr[j]+"  ");
            }
            System.out.println();
        }
    }
}

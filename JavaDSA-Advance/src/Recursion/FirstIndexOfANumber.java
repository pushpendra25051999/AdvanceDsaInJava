package Recursion;

import javax.swing.*;
import java.util.Scanner;

public class FirstIndexOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int SI = 0;
        System.out.println(FirstIndex(arr,x,SI));

    }
    public static int FirstIndex(int[] arr, int x, int SI){
        if (SI == arr.length){
            return -1;
        }if (arr[SI] == x){
            return SI;
        }else{
            int k = FirstIndex(arr, x, SI+1);
            return k;
        }
    }
}

package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfNNaturalNumbers(n));

    }
    public static int sumOfNNaturalNumbers(int n){
        if(n<0){
            return -1;
        }
        if(n == 0){
            return 0;
        }else{
            return n+sumOfNNaturalNumbers(n-1);
        }
    }
}

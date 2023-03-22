package Recursion;

import java.util.Scanner;

public class PrintFirstNNaturalNumbers {
    public static void main(String[] args) {
//        main function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFirstNNaturalNumbers(n);

    }
    public static void printFirstNNaturalNumbers(int n){
        if (n<0 || n == 0){
            System.out.print(-1);
        }
        else if(n==1){
            System.out.print(1+ " ");
        }else{
            printFirstNNaturalNumbers(n-1);
            System.out.print(n+ " ");
        }
    }
}

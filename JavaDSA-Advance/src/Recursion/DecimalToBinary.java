package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(DecimalToBinary(n));

    }
    public static int DecimalToBinary(int n){

        if (n==0){
            return 0;
        }else{
            return n%2 + 10*DecimalToBinary(n/2);
        }
    }
}

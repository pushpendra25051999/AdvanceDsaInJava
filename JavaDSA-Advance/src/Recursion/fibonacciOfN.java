package Recursion;

import java.util.Scanner;

public class fibonacciOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciOfN result = new fibonacciOfN();
        var ans = result.fibo(n);
        System.out.println(ans);

    }
    public int fibo(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

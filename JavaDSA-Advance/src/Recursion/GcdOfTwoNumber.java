package Recursion;

import java.util.Scanner;

public class GcdOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
    public static int GCD(int a, int b){
        if (a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }
}

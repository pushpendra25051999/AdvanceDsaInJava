package Recursion;

import java.util.Scanner;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(base,exp));
    }
    public static int power(int base, int exp){
        if (exp == 0){
            return 1;
        }
        if (exp == 1){
            return base;
        }
        if (exp < 0){
            return -1;
        }
        else{
            return base * power(base,exp-1);
        }
    }
}

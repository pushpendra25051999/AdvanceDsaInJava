package Recursion;

import java.util.Scanner;

public class RecursiveMethodUsingN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveN(n);
        
    }
    public static void recursiveN(int n){
        if (n<1){
            System.out.println("N is less then 1");
        }else{
            recursiveN(n-1);
            System.out.println(n);
        }
    }
}

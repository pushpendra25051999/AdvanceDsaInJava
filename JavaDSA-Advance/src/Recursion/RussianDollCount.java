package Recursion;

import java.util.Scanner;

public class RussianDollCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollCount = sc.nextInt();
        RussianDoll(dollCount);
    }
    public static void RussianDoll(int dollCount){
        if (dollCount == 1){
            System.out.println("Doll Found");
        }else{
            RussianDoll(dollCount-1);
        }
    }
}

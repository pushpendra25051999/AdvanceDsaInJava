package Recursion;

public class PrintMethodLikeRecursion {
    public static void main(String[] args) {
        firstMethod();
    }
    public static void firstMethod(){
        secondMethod();
        System.out.println("I am the first method");
    }
    public static void secondMethod(){
        thirdMethod();
        System.out.println("I am the second method");
    }
    public static void thirdMethod(){
        fourthMethod();
        System.out.println("I am the third method");
    }
    public static void fourthMethod(){
        System.out.println("I am the fourth method");
    }
}

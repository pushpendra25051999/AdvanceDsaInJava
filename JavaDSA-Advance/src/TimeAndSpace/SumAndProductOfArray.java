package TimeAndSpace;

import java.util.Scanner;

// Over all time complexity of this code will be O(n).

public class SumAndProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){   // Array input
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfArray(arr));   // Function call for sum of Array Elements.
        System.out.println(productOfArray(arr));   // Function call for product of Array Elements.
    }

    //    O(n) Time Complexity for this method
    public static int sumOfArray(int[] arr){    // Function for sum
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    //    O(n) Time Complexity for this method
    public static int productOfArray(int[] arr){     // function for product
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        return product;
    }

}

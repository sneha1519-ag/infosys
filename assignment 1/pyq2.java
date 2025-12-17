package infosys;

import java.util.Scanner;

public class pyq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Maximum number in the array is: " + getMaximumGenerated(n));
    }
    public static int getMaximumGenerated(int n) {
        if(n == 0)
            return 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 1; i <= n/2; i++) {
            if(2 * i <= n)
                arr[2 * i] = arr[i];

            if((2 * i) + 1 <= n)
                arr[(2 * i) + 1] = arr[i] + arr[i + 1];
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}

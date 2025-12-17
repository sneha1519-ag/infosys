package infosys;

import java.util.Scanner;

public class pyq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum possible value of result: " + max(arr, n));
    }
    public static int max(int[] arr, int n) {
        int maxVal = 0;
        for(int start = 0; start < n; start++) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = arr[(start + i) % n];
            }
            int ans = 0;
            int total = 0;
            for(int i = 0; i < n; i++) {
                ans = ans ^ res[i];
                total = total + ans;
            }
            maxVal = Math.max(maxVal, total);
        }
        return maxVal;
    }
}

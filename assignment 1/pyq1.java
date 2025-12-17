package infosys;

import java.util.HashMap;
import java.util.Scanner;

public class pyq1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the digit: ");
        char ch = sc.next().charAt(0);

        System.out.println(solve(str, ch));
    }

    public static Long solve(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean removed = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch && !removed) {
                removed = true;
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return Long.parseLong(sb.toString());
    }
}

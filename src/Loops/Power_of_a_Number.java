package Loops;

import java.util.Scanner;

public class Power_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        int ans = 1;
//        int ans = (int) Math.pow(base,exp);
        for (int i = 0; i < exp; i++) {
            ans*=base;
        }
        System.out.println(ans);
    }
}

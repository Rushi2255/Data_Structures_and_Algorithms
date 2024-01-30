package Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int HCF = 0;
        int small = Math.min(a,b);
        for (int i = 2; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
            }
        }
        System.out.println(HCF);
    }
}

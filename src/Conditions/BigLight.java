package Conditions;

import java.util.Scanner;

public class BigLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int num = h1-h2;
        int den = v2 - v1;

        System.out.println((num % den == 0));
    }
}

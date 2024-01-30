package Loops;

import java.util.Scanner;

public class Factorial_With_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int prod = 1;
        for (int i = n; i > 0; i--) {
            prod *= i;
        }
        System.out.println(prod);
    }
}

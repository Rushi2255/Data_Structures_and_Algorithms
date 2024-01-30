package Loops;

import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int temp = i;
            int count = 0;
            int sum = 0;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            temp = i;
            while (temp != 0) {
                int ld = temp % 10;
                int prod = 1;
                for (int j = 0; j < count; j++) {
                    prod *= ld;
                }
                sum+=prod;
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
}

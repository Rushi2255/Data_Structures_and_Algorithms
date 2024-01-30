package Conditionals;

import java.util.Scanner;

public class Number_Of_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month == 2) {
            System.out.println(28);
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        }
        else {
            System.out.println(31);
        }
    }
}

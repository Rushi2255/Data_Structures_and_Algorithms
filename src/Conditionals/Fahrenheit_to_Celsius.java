package Conditionals;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempInF = scanner.nextInt();
        int tempInC = ((tempInF-32)*5)/9;
        System.out.println(tempInC);
    }
}

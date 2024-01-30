package Conditionals;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInC = sc.nextInt();
        int tempInF = (tempInC*9/5)+32;
        System.out.println(tempInF);
    }
}

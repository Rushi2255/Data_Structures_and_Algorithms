package Loops;

import java.util.Scanner;

public class Large_Number_atleast_twice_of_others {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = -1;
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        int large = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean status = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]*2 > arr[i] && j != i) {
                    status = false;
                    break;
                }
            }
            if (status) {
                large = i;
            }
        }
        System.out.println(large);
    }
}

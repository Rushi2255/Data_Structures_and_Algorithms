package Loops;

public class HCF {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int small = a;

        if (small > b) {
            small = b;
        }
        small = Math.max(a,b);
        int HCF = 0;
        for (int i = 2; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
            }
        }
        System.out.println(HCF);


    }
}

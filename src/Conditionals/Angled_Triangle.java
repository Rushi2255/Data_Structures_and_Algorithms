package Conditionals;

import java.util.Scanner;

public class Angled_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        //Write your code
        int lar=a;
        if(b>a)
        {
            lar=b;
        }
        if(lar<c)
        {
            lar=c;
        }
        int sum=a*a+b*b+c*c;
        int sqr=2*lar*lar;
        if(sqr<sum)
            System.out.print("1");
        else if(sqr==sum)
            System.out.print("2");
        else
            System.out.print("3");

    }
}

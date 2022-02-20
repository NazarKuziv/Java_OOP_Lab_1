package lab1;

import java.util.Scanner;

public class Lab1_2 {
    static Scanner input = new Scanner(System. in);

    public static void main(String[] args) {
        double x; // вхідний аргумент
        double a,b,c; // вхідні параметри
        double F = 0; // результат обчислення виразу

        System.out.print(" x = ");
        x = input.nextDouble();
        System.out.print(" a = ");
        a = input.nextDouble();
        System.out.print(" b = ");
        b = input.nextDouble();
        System.out.print(" c = ");
        c = input.nextDouble();

        // спосіб 1: розгалуження в скороченій формі
        if (c < 0 && b != 0)
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        if (c > 0 && b == 0)
            F = (x + a) / (x + c);
        if (!(c < 0 && b != 0) && !(c > 0 && b == 0))
            F = x / c;

        System.out.print(" F1 = "+F);

        // спосіб 2: розгалуження в повній формі
        if (c < 0 && b != 0)
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        else
        if (c > 0 && b == 0)
            F = (x + a) / (x + c);
        else
            F = x / c;

        System.out.print(" F2 = "+F);


    }
}

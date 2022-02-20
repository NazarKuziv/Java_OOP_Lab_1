package lab1;

import java.util.Scanner;

public class Lab1_4 {
    static Scanner input = new Scanner(System. in);

    public static void main(String[] args) {
        double x, xp, xk, dx, a, b, c, F;
        System.out.print(" xp = ");
        xp = input.nextDouble();
        System.out.print(" xk = ");
        xk = input.nextDouble();
        System.out.print(" ax = ");
        dx = input.nextDouble();
        System.out.print(" a = ");
        a = input.nextDouble();
        System.out.print(" b = ");
        b = input.nextDouble();
        System.out.print(" c = ");
        c = input.nextDouble();
        x = xp;

        System.out.println("---------------------------");
        System.out.println("     x      |     F        ");
        System.out.println("---------------------------");
        while (x <= xk)
        {
            if (c < 0 && b != 0)
                F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
            else
            if (c > 0 && b == 0)
                F = (x + a) / (x + c);
            else
                F = x / c;

            System.out.println("     "+x+"      |     "+F+"        ");

            x += dx;
        }
        System.out.println("---------------------------");
    }
}

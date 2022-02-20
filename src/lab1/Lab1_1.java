package lab1;

import java. util. Scanner;


public class Lab1_1 {
    static Scanner input = new Scanner(System. in);
    // спосіб 1: розгалуження в скороченій формі
     static double f1(double x) {

         double B = 0;

         if (x <= -1)
             B = 3 + Math.sin(Math.abs(x));
         if (-1 < x && x <= 3)
             B = 2 * Math.exp(x / 4 - 1);
         if (x > 3)
             B = 7 - Math.sqrt(2) * Math.pow(x, 3);

         return B;
    }
    // спосіб 2: розгалуження в повній формі
    static double f2(double x) {
        double B = 0;

        if (x <= -1)
            B = 3 + Math.sin(Math.abs(x));
        else
        if (-1 < x && x <= 3)
            B = 2 * Math.exp(x / 4 - 1);
        else
            B = 7 - Math.sqrt(2) * Math.pow(x, 3);

        return B;
    }

    public static void main(String[] args) {


        double x; // вхідний параметр
        double y; // результат обчислення виразу
        System.out.print(" x = ");
        x = input.nextDouble();

        double A = 5 * Math.pow(Math.exp(x),3);

        y = A - f1(x);
        System.out.println(" y1 = " + y);
        y = A - f2(x);
        System.out.println(" y2 = " + y);
    }
}

package lab1;

import java.util.Scanner;

public class Lab1_3 {
    static Scanner input = new Scanner(System. in);


    public static void main(String[] args) {
        int k, N;
        double S = 1;

        System.out.print(" N = ");
        N = input.nextInt();
        k=N;

        while (k <= 19)
        {
            S *= (1.0 * k - N) / (1.0 * k + N) + 1;
            k++;
        }
        System.out.println(" S1 = " + String.format("%.2f", S));

        S = 1;
        k = N;
        do
        {
            S *= (1.0 * k - N) / (1.0 * k + N) + 1;
            k++;
        } while (k <= 19);
        System.out.println(" S2 = " + String.format("%.2f", S));

        S = 1;
        for (k = N; k <= 19; k++)
        {
            S *= (1.0 * k - N) / (1.0 * k + N) + 1;
        }
        System.out.println(" S3 = " + String.format("%.2f", S));

        S = 1;
        for (k = 19; k >= N; k--)
        {
            S *= (1.0 * k - N) / (1.0 * k + N) + 1;
        }
        System.out.println(" S4 = " + String.format("%.2f", S));


    }
}

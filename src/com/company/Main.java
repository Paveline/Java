package com.company;

import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static String NumberFormat(double value) {
        return String.format("%.3f", value);
    }

    public static double TailorFunc(double x, double e) {
        double sum = 1;
        double first = 0;
        double second = 1;
        int n = 1;

        while (Math.abs(second) >= Math.abs(e)) {
            first = second;
            second = (first * (-1) * (2*n - 1) * (2*n) * (3 - 2 * n)) / ((1 - 2 * n) * n * n *4)*x;
            sum += second;
            n++;
        }
        return sum;
    }

    public static double TailorActualFunc(double x) {
        return Math.sqrt(1 + x);
    }

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Input: x | x: (-1;+1)");
            double x = in.nextDouble();
            if (x <= -1 || x >= 1) {
                throw new Exception("Out of the interval");
            }

            System.out.println("Input: k");
            int k = in.nextInt();
            if (k < 1) {
                throw new Exception("Don't natural");
            }
            double e = Math.pow(10, -k);

            double result = TailorFunc(x, e);
            System.out.println(NumberFormat(result));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

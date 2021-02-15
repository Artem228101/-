package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a ");
        double a = in.nextDouble();
        System.out.println("Enter b ");
        double b = in.nextDouble();
        System.out.println("Enter c ");
        double c = in.nextDouble();
        double d = Math.pow(b, 2) - (4 * a * c);
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 " + x1 + ", x2 " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("x " + x);
        } else {
            System.out.println("No roots ");
        }
    }
}
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        double a;
        double b;
        double x;
        double root;
        System.out.print("Enter begining of interval: ");
        a = Scan.nextDouble();
        System.out.print("Enter end of interval: ");
        b = Scan.nextDouble();
        System.out.print("Enter root of method: ");
        root = Scan.nextDouble();
        if (function(a) * function(b) > 0.0d) {
            System.out.println("Function has same signs at ends of interval");
            return;
        }
        x = a;
        while(Math.abs(function(x)) > root){
            System.out.println("X: " + x + " f(x): " + function(x));
            x = b - ((function(b) * (b - a)) / (function(b) - function(a)));
            a = b;
            b = x;
        }
    }
    private static double function(double x) {
        return x * (x + 2) - 1;
    }
}
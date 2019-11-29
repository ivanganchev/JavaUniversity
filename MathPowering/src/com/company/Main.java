package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double a = obj.nextDouble();
        double b = obj.nextDouble();

	    System.out.println(Math.pow(a, b));
    }
}

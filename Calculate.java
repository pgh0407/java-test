package org.example;

public class Calculate {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 3;

        System.out.println("더하기: " + add(num1, num2));
        System.out.println("빼기: " + subtract(num1, num2));
        System.out.println("곱하기: " + multiply(num1, num2));
        System.out.println("나누기: " + divide(num1, num2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("ERROR");
            return 0;
        }
        return a / b;
    }
}
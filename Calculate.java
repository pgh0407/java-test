package org.example;

public class Calculate {

    public static void calculate(int num1, int num2, char operator) {
        switch(operator) {
            case '+':
                System.out.println("답: " + (num1 + num2));
                break;
            case '-':
                System.out.println("답: " + (num1 - num2));
                break;
            case '*':
                System.out.println("답: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("답: " + (num1 / num2));
                } else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("빈 칸");
                break;
        }
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 3;
        char operator = '/';

        calculate(num1, num2, operator);
    }
}
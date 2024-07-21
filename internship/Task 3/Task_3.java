package com.internship.task;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the First Number");
        int a = scanner.nextInt();
        
        System.out.println("Enter the Second Number");
        int b = scanner.nextInt();
        
        int d = 0;
        
        System.out.println("Enter the Operation: (+, -, *, /)");
        char c = scanner.next().charAt(0);
        
        switch (c) {
            case '+':
                d = a + b;
                break;
            case '-':
                d = a - b;
                break;
            case '*':
                d = a * b;
                break;
            case '/':
                if (b != 0) {
                    d = a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        
        System.out.println("Result: " + d);
    }
}
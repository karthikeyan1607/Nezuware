package com.internship.task;
import java.util.Scanner;
import java.util.Random;

class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100) + 1; 
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int maxAttempts = 10; 
        
        System.out.println("Guess the Number (between 1 and 100):");
        
        while (attempts < maxAttempts) {
            int m = scanner.nextInt();
            attempts++;
            
            if (x == m) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (x > m) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was " + x);
        }
    }}
    
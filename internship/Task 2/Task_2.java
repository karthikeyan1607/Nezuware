package com.internship.task;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter source scale (C/F/K): ");
        String sourceScale = scanner.nextLine().toUpperCase();

        System.out.print("Enter target scale (C/F/K): ");
        String targetScale = scanner.nextLine().toUpperCase();

        if (!isValidScale(sourceScale) || !isValidScale(targetScale)) {
            System.out.println("Invalid scale. Please use 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin.");
            return;
        }

        double convertedTemperature = convertTemperature(temperature, sourceScale, targetScale);

        System.out.printf("Converted Temperature: %.2f %s\n", convertedTemperature, targetScale);
    }

    private static boolean isValidScale(String scale) {
        return scale.equals("C") || scale.equals("F") || scale.equals("K");
    }

    private static double convertTemperature(double temperature, String sourceScale, String targetScale) {
        if (sourceScale.equals(targetScale)) {
            return temperature;
        }

        double tempInCelsius;

        
        switch (sourceScale) {
            case "F":
                tempInCelsius = (temperature - 32) * 5 / 9;
                break;
            case "K":
                tempInCelsius = temperature - 273.15;
                break;
            default:
                tempInCelsius = temperature;
        }

       
        switch (targetScale) {
            case "F":
                return (tempInCelsius * 9 / 5) + 32;
            case "K":
                return tempInCelsius + 273.15;
            default:
                return tempInCelsius;
        }
    }
}

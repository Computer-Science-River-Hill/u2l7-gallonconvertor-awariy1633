package org.example; //DO NOT DELETE
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of gallons: ");
        double gallons = scanner.nextDouble();
        
        double quarts = gallons * 4;
        double pints = quarts * 2;
        double cups = pints * 2;
        double tablespoons = cups * 16;
        
        System.out.println("\nIn " + gallons + " gallons there are:");
        System.out.println(quarts + " quarts");
        System.out.println(pints + " pints");
        System.out.println(cups + " cups");
        System.out.println(tablespoons + " tablespoons");
        
        scanner.close();
    }
}

package org.launchcode;

import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();


        double area = Circle.getArea(radius);

        System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}





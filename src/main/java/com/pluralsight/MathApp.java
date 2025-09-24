package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        int bobSalary = 33500;
        int garySalary = 175000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        // Question 2
        double carPrice = 40999.50;
        double truckPrice = 156799;
        double smallestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The cheaper vehicle costs " + smallestPrice);

        // Question 3
        double circleRadius = 7.25;
        double circleArea = Math.PI * (Math.pow(circleRadius, 2));

        System.out.println("The area of the circle is: " + circleArea);

        // Question 4
        double numTest = 5.0;
        double sqrtNum = Math.sqrt(numTest);

        System.out.println("The square root is: " + sqrtNum);

        // Question 5
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distanceX = x2 - x1;
        double distanceY = y2 - y1;
        double distancePoints = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

        System.out.println("The distance between the two points is: " + distancePoints);

        // Question 6
        double value = -3.8;
        double absoluteValue = Math.sqrt(Math.pow(value, 2));

        System.out.println("The absolute value is: " + absoluteValue);

        // Question 7
        double randomNum = Math.random();
        System.out.println("A random number between 0 and 1 is: " + randomNum); // System.out.println("A random number between 0 and 1 is: " + Math.random);

        // Question 8
        int days = 24;
        int minutes = 60 * (days * 24); //Math.multiplyExact(60, (days * 24));
        long milliseconds = 1000 * (60 * minutes); //Math.multiplyExact(1000, (60 * minutes));

        System.out.println("There are " + minutes + " minutes and " + milliseconds + " milliseconds in " + days + " days");
    }
}

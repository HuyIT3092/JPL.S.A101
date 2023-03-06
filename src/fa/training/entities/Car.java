package fa.training.entities;

import java.util.Scanner;


public abstract class Car {
    int speed;
    double regularPrice;
    String color;

    public void inputInfoCar(Scanner scanner) {
        System.out.println("Enter the speed(km/h): ");
        speed = scanner.nextInt();
        System.out.println("Enter the color: ");
        color = scanner.next();
        System.out.println("Enter the regular price: ");
        regularPrice = scanner.nextDouble();
    }



    public void display(){
        System.out.println("Speed: " + speed + "\t" + " Color: " + color + "\t" + " Regular price: " + regularPrice);
    }

    abstract double getSalePrice();
}

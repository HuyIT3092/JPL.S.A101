package fa.training.entities;

import java.util.Scanner;

public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    @Override
    double getSalePrice() {
        return (regularPrice - manufacturerDiscount);
    }

    @Override
    public void inputInfoCar(Scanner scanner) {

        super.inputInfoCar(scanner);
        System.out.println("Enter the year of the ford: ");
        year = scanner.nextInt();
        System.out.println("Enter manufacturerDiscount: ");
        manufacturerDiscount = scanner.nextInt();
        System.out.println("-----------------------------");

    }

    @Override
    public void display() {

        super.display();
        System.out.println("Year of the ford: " + year + "\t" + " Final price: " + this.getSalePrice() + "\n");
    }
}

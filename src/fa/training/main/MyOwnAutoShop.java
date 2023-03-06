package fa.training.main;

import fa.training.entities.Car;
import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;

import java.util.Scanner;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Truck: ");
        int a = sc.nextInt();
        System.out.println("Enter number of Ford: ");
        int b = sc.nextInt();
        System.out.println("Enter number of Sedan: ");
        int c = sc.nextInt();
        System.out.println("Enter number of Car: " + (a + b + c));
        int n = a + b + c;
        Car[] cars = new Car[n];
        //Create 3 array objects
        Truck[] truck = new Truck[a];
        Ford[] ford = new Ford[b] ;
        Sedan[] sedan = new Sedan[c];
        for (int i = 0; i < a; i++) {
            truck[i] = new Truck();
            //Call input method
            truck[i].inputInfoCar(sc);
            //Push to exist array
            cars[i] = truck[i];
        }
        for (int i = 0; i < b; i++) {
            ford[i] = new Ford();
            //Call input method
            ford[i].inputInfoCar(sc);
            //Push to exist array
            cars[i + a] = ford[i];
        }
        for (int i = 0; i < c; i++) {
            sedan[i] = new Sedan();
            //Call input method
            sedan[i].inputInfoCar(sc);
            //Push to exist array
            cars[i + a + b] = sedan[i];
        }
        for (Car car : cars) {
            car.display();
        }


    }

}

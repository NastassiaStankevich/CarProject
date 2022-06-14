package by.itstep.Stank.javalessons.lesson15.controller;

import by.itstep.Stank.javalessons.lesson15.model.data.Car;
import by.itstep.Stank.javalessons.lesson15.model.logic.CarManager;
import by.itstep.Stank.javalessons.lesson15.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        Car car1 =new Car();
        car1.name = "ford";
        car1.price = 3000;

        Car car2 =new Car();
        car2.name = "opel";
        car2.price = 4500;

        Car car3 =new Car();
        car3.name = "BMW";
        car3.price = 7000;

        Car car4 =new Car();
        car4.name = "fiat";
        car4.price = 5450;

        int maxPrice = CarManager.findExpensiveCar(car1, car2, car3, car4);
        int total = CarManager.calculateTotalPrice(car1, car2, car3, car4);

        String msg = String.format(" max price = %d",maxPrice);
        msg += String.format(" Total = $%d", total);

        ConsolePrinter printer= new ConsolePrinter();
        printer.print(msg);
    }
}

package ru.job4j.carmanager;

import java.util.Objects;

public class Car {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                '}';
    }

    private int distance = 0;

    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance (int additinalDistance) {
        distance += additinalDistance;
    }

    public void addDistance (double additinalDistance) {
        distance += additinalDistance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction &&
                price == car.price &&
                weight == car.weight &&
                name.equals(car.name) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfProduction, price, weight, color);
    }

}
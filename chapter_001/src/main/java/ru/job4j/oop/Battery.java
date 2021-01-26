package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void charge(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(85);
        Battery secondBattery = new Battery(15);
        System.out.println("firstBattery : " + firstBattery.load + ". secondBattery : " + secondBattery.load);
        firstBattery.charge(secondBattery);
        System.out.println("first : " + firstBattery.load + ". second : " + secondBattery.load);

    }

}

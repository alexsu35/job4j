package ru.job4j.tracker;

import java.time.LocalDateTime;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("itemName");
        tracker.add(item);
        System.out.println(tracker.findById(1).getName());

    }
}

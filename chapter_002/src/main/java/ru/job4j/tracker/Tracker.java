package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsFindByName = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Item elem = items[i];
            if (elem.getName().equals(key)) {
                itemsFindByName[size] = elem;
                size++;
            }
        }
        return Arrays.copyOf(itemsFindByName, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
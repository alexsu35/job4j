package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String typeSurgeon;

    public Surgeon(String name, String surname, String education, String birthday,
                   boolean childrensDoctor, String hospitalType, String typeSurgeon) {
        super(name, surname, education, birthday, childrensDoctor, hospitalType);
        this.typeSurgeon = typeSurgeon;
    }

    public String gettypeSurgeon() {
        return this.typeSurgeon;
    }

}

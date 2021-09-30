package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String typeDentist;

    public Dentist(String name, String surname, String education, String birthday,
                   boolean childrensDoctor, String hospitalType, String typeDentist) {
        super(name, surname, education, birthday, childrensDoctor, hospitalType);
        this.typeDentist = typeDentist;
    }

    public String getTypeDentist() {
        return typeDentist;
    }
}

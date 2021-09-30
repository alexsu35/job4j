package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean childrensDoctor;
    private String hospitalType;

    public Doctor(String name, String surname, String education, String birthday,
                  boolean childrensDoctor, String hospitalType) {
        super(name, surname, education, birthday);
        this.childrensDoctor = childrensDoctor;
        this.hospitalType = hospitalType;
    }

    public boolean getChildrensDoctor() {
        return this.childrensDoctor;
    }

    public String getHospitalType() {
        return this.hospitalType;
    }
}

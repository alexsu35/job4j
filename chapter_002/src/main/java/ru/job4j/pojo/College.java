package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Гоголь");
        student.setName("Николай");
        student.setMiddleName("Васильевич");
        student.setGroup("Подготовительная");
        student.setEnrollment(new Date());

        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getMiddleName() + System.lineSeparator() + "группа " + student.getGroup() + System.lineSeparator() + "дата поступления: " + student.getEnrollment());
    }
}

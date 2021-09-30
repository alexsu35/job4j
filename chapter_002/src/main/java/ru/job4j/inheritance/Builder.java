package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String designPrograms;

    public Builder(String name, String surname, String education, String birthday,
                   boolean knowledgeOffice, String firmsType, String designPrograms) {
        super(name, surname, education, birthday, knowledgeOffice, firmsType);
        this.designPrograms = designPrograms;
    }

    public String getDesignPrograms() {
        return designPrograms;
    }
}

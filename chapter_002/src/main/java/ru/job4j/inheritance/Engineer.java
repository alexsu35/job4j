package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean knowledgeOffice;
    private String firmsType;

    public Engineer(String name, String surname, String education, String birthday,
                    boolean knowledgeOffice, String firmsType) {
        super(name, surname, education, birthday);
        this.knowledgeOffice = knowledgeOffice;
        this.firmsType = firmsType;
    }

    public boolean getKnowledgeOffice() {
        return this.knowledgeOffice;
    }

    public String getFirmsType() {
        return this.firmsType;
    }
}

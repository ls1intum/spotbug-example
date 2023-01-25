package de.tum.in.ase;

public class Student {

    private String forename;
    private String surname;

    public Student(String forename, String surname) {
        setForename(forename);
        setSurname(surname);
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        forename.replaceAll("[^A-Za-z\\-]", "");
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname.replaceAll("[^A-Za-z\\-]", "");
        this.surname = surname;
    }
}

package ru.mirea;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender) {
        this.name = name;
        setEmail(email);
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;}

    public String toString() {

        return getName() + " (" + getGender() + ") at " + getEmail();
    }
}

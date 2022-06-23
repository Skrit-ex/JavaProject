package Lesson.Nasledovanie;

public class Student {
    private String firstName, lastName, group;
    double mark;
    int stepa;

    public Student(String firstName, String lastName, String group, double mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStepa() {
        if (mark == 5) {                   // можно записать кратко mark==5 ? 100 : 80;
            stepa = 100;
        } else {
            stepa = 80;
        }
        return stepa;
    }
}


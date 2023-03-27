package at.kaindorf.pattern.strategy.Sort;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 13. März 2023<br>
 * <b>Time:</b> 12:17<br>
 */

public class Student implements Comparable<Student> {
    private String firstname;
    private String lastname;
    private double height;
    private LocalDate birthdate;

    public Student(String firstname, String lastname, double height, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getLastname)
                .thenComparing(Student::getFirstname)
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

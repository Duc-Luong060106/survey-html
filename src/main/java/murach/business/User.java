package  murach.business;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;


    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.birthday = null;
    }

    public User(String firstName, String lastName, String email, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}


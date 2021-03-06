package br.com.skygod.awesome.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

@Entity
public class Student
        extends AbstractEntity {

    @NotEmpty(message = "The name field is required!")
    private String name;

    @Email(message = "Type it an valid email!")
    @NotEmpty
    private String email;

    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(Long id, String name, String email) {
        this(name, email);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [ " +
                "id: " + id +
                "name: " + name +
                ", email: " + email +
                " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

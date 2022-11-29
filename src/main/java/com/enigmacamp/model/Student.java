package com.enigmacamp.model;

import lombok.Getter;
import lombok.Setter;

public class Student {
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private Major major;
    
    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", major=" + major + '}';
    }
}

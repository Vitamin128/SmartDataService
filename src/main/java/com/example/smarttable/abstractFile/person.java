package com.example.smarttable.abstractFile;

import lombok.Data;

@Data
public abstract class person {
    private String firstName;
    private String lastName;
    private String email;
    public abstract String whoami();
    public person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

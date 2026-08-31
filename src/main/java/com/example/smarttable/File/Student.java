package com.example.smarttable.File;

import com.example.smarttable.abstractFile.Person;
import com.example.smarttable.iterfaceFile.motion;

public class Student extends Person implements motion {
    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }
    public String say() {
        return getFirstName() + " " + getLastName();
    }
    public String whoami()
    {
        return getEmail();
    }
    public String walk() {
        return getFirstName() + " " + getLastName();
    }
}

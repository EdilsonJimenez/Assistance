package com.example.edilson.assistance;

import java.util.Date;

public class User {
    public String License;
    public String username;
    public String Name1;
    public String Name2;
    public String Name3;
    public String LastName1;
    public String LastName2;
    public Date BirthDate;
    public String Email;
    public String Phone;
    public String FKLicenceType;
    public String password;

    public User(String license, String username, String name1, String name2, String name3, String lastName1, String lastName2, Date birthDate, String email, String phone, String FKLicenceType, String password) {
        License = license;
        this.username = username;
        Name1 = name1;
        Name2 = name2;
        Name3 = name3;
        LastName1 = lastName1;
        LastName2 = lastName2;
        BirthDate = birthDate;
        Email = email;
        Phone = phone;
        this.FKLicenceType = FKLicenceType;
        this.password = password;
    }
}

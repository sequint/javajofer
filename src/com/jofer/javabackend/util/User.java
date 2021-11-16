package com.jofer.javabackend.util;

import java.util.UUID;

public class User {
    // User class private variables
    String iD,
            firstName,
            lastName,
            username,
            avatar;

    // Default Constructor
    public User() {
        iD = UUID.randomUUID().toString();
        firstName = "";
        lastName = "";
        username = "";
        avatar = "";
    }

    // Setter methods
    public void setFirstName( String first ) {
        firstName = first;
    }
    public void setLastName( String last ) {
        lastName = last;
    }
    public void setUsername( String userNm ) {
        username = userNm;
    }
    public void setAvatar( String avt ) {
        avatar = avt;
    }

    // Getter methods
    public String getiD() {
        return iD;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
    public String getAvatar() {
        return avatar;
    }

}

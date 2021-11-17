package com.jofer.javabackend.util;

import java.util.UUID;

public class User {
    // User class private variables
    private String iD;
    private String firstName;
    private String lastName;
    private String username;
    private String avatar;

    // Default Constructor
    public User() {
        iD = UUID.randomUUID().toString();
    }

    // Setter methods
    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }
    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    public void setUsername( String username ) {
        this.username = username;
    }
    public void setAvatar( String avatar ) {
        this.avatar = avatar;
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

package com.jofer.javabackend.user;

public class User {
    // User class private variables
    String firstName,
            lastName,
            username,
            avatar;

    // Default Constructor
    public User() {
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class User {

    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String password;

    public User(String userId, String firstName, String lastName,
                String email, String phoneNumber) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public boolean login(String inputPassword) {
        return password != null && password.equals(inputPassword);
    }

    public void logout() {
        // placeholder for session handling
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

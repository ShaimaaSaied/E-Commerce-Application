package org.iti.model.entity;

import java.util.HashSet;
import java.util.Set;

public class User  implements java.io.Serializable {


     private Integer userId;
     private String firstName="";
     private String lastName="";
     private String username;
     private String password;
     private String jop;
     private String email;
     private int creditLimit;
     private String address;
     private String role;
     private Set carts = new HashSet(0);

    public User() {
    }

    public User(String username, String password, String email, int creditLimit) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public User(String firstName, String lastName, String username, String password, String email, int creditLimit, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.creditLimit = creditLimit;
        this.role = role;
    }
    public User(String firstName, String lastName, String username, String password, String jop, String email, int creditLimit, String address, String role, Set carts) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.username = username;
       this.password = password;
       this.jop = jop;
       this.email = email;
       this.creditLimit = creditLimit;
       this.address = address;
       this.role = role;
       this.carts = carts;
    }

    public User(String username, String password, String jop, String email, String address) {
        this.username = username;
        this.password = password;
        this.jop = jop;
        this.email = email;
        this.address = address;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJop() {
        return this.jop;
    }
    
    public void setJop(String jop) {
        this.jop = jop;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCreditLimit() {
        return this.creditLimit;
    }
    
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public Set getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", creditLimit=" + creditLimit +
                ", role='" + role + '\'' +
                '}';
    }
}



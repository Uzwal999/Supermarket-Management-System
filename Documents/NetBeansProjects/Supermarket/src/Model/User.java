/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class User {
    private String username;
    private String password;
    private String role; // "Seller"

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "Seller";
    }
    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}

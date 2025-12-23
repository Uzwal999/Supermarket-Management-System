/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.User;
import java.util.ArrayList;

public class UserManager {
    // This list replaces the database "Users" table
    public static ArrayList<User> sellerList = new ArrayList<>();

    static {
        // Pre-load at least one seller so you can log in immediately
        sellerList.add(new User("seller1", "pass123"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance2020.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author hp
 */
public class User 
{
    
    private final StringProperty userName;
    private final StringProperty userPassword;
    
    public User() {
        this(null, null);
    }

    public User(String userName, String userPassword) 
    {
        this.userName = new SimpleStringProperty(userName);
        this.userPassword = new SimpleStringProperty(userPassword);
    }

    public StringProperty getUserName() {
        return userName;
    }

    public StringProperty getUserPassword() {
        return userPassword;
    }
    
}

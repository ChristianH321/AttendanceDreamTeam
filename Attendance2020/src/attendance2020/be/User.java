/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance2020.be;

import javafx.beans.property.StringProperty;

/**
 *
 * @author hp
 */
public class User 
{
    
    private StringProperty userName;
    private StringProperty userPassword;

    public User(StringProperty userName, StringProperty userPassword) 
    {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public StringProperty getUserName() {
        return userName;
    }

    public StringProperty getUserPassword() {
        return userPassword;
    }

    public void setUserName(StringProperty userName) {
        this.userName = userName;
    }

    public void setUserPassword(StringProperty userPassword) {
        this.userPassword = userPassword;
    }
    
    
    
    
    
}

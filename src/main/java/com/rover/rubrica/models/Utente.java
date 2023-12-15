/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rover.rubrica.models;

import java.util.Objects;

/**
 *
 * @author Simone
 */
public class Utente {
    
    private final String username;
    private final String password;
    
    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    @Override
    public String toString(){
        return this.username + ";" + this.password;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Utente)){
            return false;
        }
        
        Utente u = (Utente) o;
        return u.username.equals(this.username) && u.password.equals(this.password);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.username);
        hash = 59 * hash + Objects.hashCode(this.password);
        return hash;
    }
}

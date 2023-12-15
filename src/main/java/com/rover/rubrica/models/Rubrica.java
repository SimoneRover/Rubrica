/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rover.rubrica.models;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Simone
 */
public class Rubrica {
    
    private final Set<Persona> contatti;

    public Rubrica() {
        contatti = new HashSet<>();
    }

    public boolean aggiungiContatto(Persona p) {
        boolean esito;
        try {
            esito = contatti.add(p);
        } catch(Exception e) {
            esito = false;
        }
        return esito;
    }

    public boolean rimuoviContatto(Persona p) {
        boolean esito;
        try {
            esito = contatti.remove(p);
        } catch(Exception e) {
            esito = false;
        }
        return esito;
    }
    
    public Persona getPersona(String telefono) {
        for (Persona p : contatti){
            if (p.getTelefono().equals(telefono)) {
                return p;
            }
        }
        return null;
    }
    
    public Iterator<Persona> getRubrica() {
        return this.contatti.iterator();
    }
    
    public boolean hasTelefono(String telefono) {
        for (Persona p : this.contatti) {
            if (p.getTelefono().equals(telefono)){
                return true;
            }
        }
        return false;
    }

}

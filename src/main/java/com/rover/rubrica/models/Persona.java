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
public class Persona {
    private final String nome;
    private final String cognome;
    private final String indirizzo;
    private final String telefono;
    private final int eta;

    public Persona(String nome, String cognome, String indirizzo, String telefono, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.eta = eta;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public String getIndirizzo(){
        return this.indirizzo;
    }
    
    public int getEta(){
        return this.eta;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Persona)) {
            return false;
        }
        Persona p = (Persona) other;
        return this.nome.equals(p.nome) && this.cognome.equals(p.cognome) && this.indirizzo.equals(p.indirizzo) && this.telefono.equals(p.telefono) && this.eta == p.eta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.cognome);
        hash = 79 * hash + Objects.hashCode(this.indirizzo);
        hash = 79 * hash + Objects.hashCode(this.telefono);
        hash = 79 * hash + this.eta;
        return hash;
    }

    @Override
    public String toString() {
        return this.nome + ";" + this.cognome + ";" + this.indirizzo + ";" + this.telefono + ";" + this.eta;
    }
}

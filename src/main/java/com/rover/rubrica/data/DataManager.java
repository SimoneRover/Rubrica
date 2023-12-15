/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rover.rubrica.data;

import com.rover.rubrica.models.Persona;
import com.rover.rubrica.models.Rubrica;
import com.rover.rubrica.models.Utente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class DataManager {
    
    private final File usersDir;
    private final File contattiDir;
    
    public DataManager(String path) {
        this.usersDir = new File(path + "users" + File.separator);
        this.contattiDir = new File(path + "contatti" + File.separator);
    }
    
    public Rubrica getAllData() {
        File[] dirListing = this.contattiDir.listFiles();
        
        if (dirListing == null) {
            return new Rubrica();
        }
        
        Rubrica r = new Rubrica();
        Scanner reader;
        for (File f : dirListing){
            try {
                reader = new Scanner(f);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    // create Persona from data
                    String[] parsedData = data.split(";");
                    r.aggiungiContatto(new Persona(parsedData[0], parsedData[1], parsedData[2], parsedData[3], Integer.parseInt(parsedData[4])));
                }
                reader.close();
            } catch (FileNotFoundException e) {
                return r;
            }
        }
        return r;
    }
    
    public Persona getPersonaData(String telefono) {
        File[] dirListing = this.contattiDir.listFiles();
        
        if (dirListing == null) {
            return null;
        }
        
        Scanner reader;
        for (File f : dirListing) {
            if (f.getName().contains(telefono)) {
                try {
                    reader = new Scanner(f);
                    while (reader.hasNextLine()){
                        String data = reader.nextLine();
                        // create Persona from data
                        String[] parsedData = data.split(";");
                        return new Persona(parsedData[0], parsedData[1], parsedData[2], parsedData[3], Integer.parseInt(parsedData[4]));
                    }
                } catch (FileNotFoundException e) {
                    return null;
                }
                
            }
        }
        return null;
    }
    
    public boolean savePersonaData(Persona p) {
        File f = new File(this.contattiDir.getAbsolutePath() + File.separator + p.getTelefono() + ".txt");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(p.toString());
            pw.close();
            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean saveAll(Rubrica r) {
        Iterator<Persona> iterator = r.getRubrica();
        
        while (iterator.hasNext()){
            if (!savePersonaData(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean deletePersona(Persona p) {
        File[] dirListing = this.contattiDir.listFiles();
        
        if (dirListing == null) {
            return false;
        }
        for (File f : dirListing) {
            if (f.getName().contains(p.getTelefono())) {
                f.delete();
                return true;
            }
        }
        return false;
    }
    
    public boolean registerUser(Utente u) {
        if (hasUsername(u.getUsername())){
            return false;
        }
        
        File f = new File(this.usersDir.getAbsolutePath() + File.separator + u.getUsername() + ".user");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(u.toString());
            pw.close();
            fw.close();
        } catch(IOException e) {
            return false;
        }
        return true;
    }
    
    public boolean validateLogin(Utente u) {
        if (!hasUsername(u.getUsername())){
            System.out.println("[validateLogin] No username " + u.getUsername());
            return false;
        }
        
        File[] dirListing = this.usersDir.listFiles();
        Scanner reader;
        for (File f : dirListing) {
            if (f.getName().equals(u.getUsername() + ".user")) {
                // found user data file
                try {
                    reader = new Scanner(f);
                    while (reader.hasNextLine()){
                        String data = reader.nextLine();
                        String[] parsedData = data.split(";");
                        Utente found = new Utente(parsedData[0], parsedData[1]);
                        System.out.println(found.toString());
                        System.out.println(u.toString());
                        return u.equals(found);
                    }
                } catch(FileNotFoundException e){
                    System.out.println("[validateLogin] FileNotFoundException");
                    return false;
                }
            }
        }
        System.out.println("[validateLogin] No user data file found");
        return false;
    }
    
    public boolean hasUsername(String username) {
        File[] dirListing = this.usersDir.listFiles();
        
        if (dirListing == null) {
            return false;
        }
        
        for (File f : dirListing) {
            if (f.getName().equals(username + ".user")){
                return true;
            }
        }
        return false;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rover.rubrica;

import com.rover.rubrica.data.DataManager;
import com.rover.rubrica.models.Utente;
import com.rover.rubrica.views.Login;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Simone
 */
public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("informazioni" + File.separator);
        if (!Files.exists(path)){
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        Path contattiPath = Paths.get("informazioni" + File.separator + "contatti" + File.separator);
        if (!Files.exists(contattiPath)){
            try {
                Files.createDirectory(contattiPath);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        Path usersPath = Paths.get("informazioni" + File.separator + "users" + File.separator);
        if (!Files.exists(usersPath)){
            try {
                Files.createDirectory(usersPath);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        DataManager dm = new DataManager("informazioni" + File.separator);
        dm.registerUser(new Utente("admin", "admin"));
        Login login = new Login(dm);
        login.show();
    }
}

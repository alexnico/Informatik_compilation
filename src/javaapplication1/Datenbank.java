/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.mysql.jdbc.Statement;
import java.awt.TextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alexander
 */
public class Datenbank {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        //Hauptansichtfenster öffnen
        LogInView login = new LogInView();
        login.setVisible(true);

        System.out.println("Loginfenster geöffnet");

    }

   

}

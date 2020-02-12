package my_project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alaka
 */
public class MyConnection {
    Connection cnx;
    
    String url="jdbc:mysql://localhost:3306/projet";
    String login="root";
    String mdp="";
    static MyConnection mycnx;
    private MyConnection(){
    
        try {
            cnx = DriverManager.getConnection(url,login,mdp);
            System.out.println("connection établie");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public Connection getCnx(){
    return cnx;
    }
    
    public static MyConnection getInstance(){
    if(mycnx==null){
    mycnx= new MyConnection();
    }
        return mycnx;
    
    }
    
}

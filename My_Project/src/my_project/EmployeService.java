package my_project;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
public class EmployeService {
    Connection cn = MyConnection.getInstance().getCnx();
   
    public void ajouterEmploye(Employe e){
    String requete="insert into employe(nom,prenom,titre,salaire)values  ( '"+e.getNom()+"', '"+e.getPrenom()+"', '"+e.getTitre()+"', '"+e.getSalaire()+"')";
        try { 
            Statement st = cn.createStatement();
            st.executeUpdate(requete);
            System.out.println("Employe ajouté");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modifierEmploye(int id ,String nom, String prenom, String titre, int salaire){
    String requete="update employe set nom='"+nom+"',prenom='"+prenom+"', titre='"+titre+"', salaire='"+salaire+"' where id="+id+"";
        try { 
            Statement st = cn.createStatement();
            st.executeUpdate(requete);
            System.out.println("Employe modifié");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }

    
    public void supprimerEmploye(int id){
        String requete="delete from employe where id="+id+"";
        try { 
            Statement st = cn.createStatement();
            st.executeUpdate(requete);
            System.out.println("Employe supprimé");
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Employe consulterSalaire(int id){
        String requete="select salaire from employe where id="+id+"";
        Employe e = new Employe();

        try { 
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
            e.setSalaire(rs.getInt("salaire"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    public List<Employe> consulterEmploye(){
    List<Employe> list = new ArrayList<>();
    String requete="select * from employe";
        try {
            Statement st =cn.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
            Employe e = new Employe();
            e.setId(rs.getInt(1));
            e.setNom(rs.getString(2));
            e.setPrenom(rs.getString("prenom"));
            e.setTitre(rs.getString("titre"));
            e.setSalaire(rs.getInt("salaire"));
            list.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return list ;
    }
    public List<Employe> trieEmploye(String o ) 
    {
        String requete = "SELECT * FROM employe order by " +o;
        PreparedStatement pst;
            List<Employe> list = new ArrayList<>();

        try {
            pst = cn.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                
            Employe e = new Employe();
            e.setId(rs.getInt(1));
            e.setNom(rs.getString(2));
            e.setPrenom(rs.getString(3));
            e.setTitre(rs.getString(4));
            e.setSalaire(rs.getInt(5));
            list.add(e);
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
             
    }
    public List<Employe> rechercheEmploye(String esmElcolumn, String elibechtlawej3lih) {
        List<Employe> list = new ArrayList<>();
        String requete;
      
            requete = "select * from employe where "+esmElcolumn+" like '%"+elibechtlawej3lih+"%'";
     
        try {
            Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(requete);
        while (rs.next()) {

            Employe e = new Employe();
            e.setId(rs.getInt(1));
            e.setNom(rs.getString(2));
            e.setPrenom(rs.getString(3));
            e.setTitre(rs.getString(4));
            e.setSalaire(rs.getInt(5));
            list.add(e);
        }
    }
    catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE, null, ex);
    }

    return list ;
}

       }

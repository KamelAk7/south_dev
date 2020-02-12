/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_project;

/**
 *
 * @author alaka
 */
public class Employe {
    int id ;
    String nom;
    String prenom;
    String titre;
    int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String titre, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.titre = titre;
        this.salaire = salaire;

    }

    public Employe(int id, String nom, String prenom, String titre, int salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.titre = titre;
        this.salaire = salaire;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "\n Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", titre=" + titre + ", salaire=" + salaire +'}';
    }
    public String afficherSalaire(){
    return "votre salaire est:"+salaire;
    
    }
 
}

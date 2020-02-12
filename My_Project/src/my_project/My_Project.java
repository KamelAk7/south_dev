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
public class My_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyConnection mc = MyConnection.getInstance();
        Employe e = new Employe("Exposito","Ester","Femme de ménage",350);
        Employe e1 = new Employe("Ronaldo","Cristiano","boss",999999999);
        EmployeService es =new EmployeService() ;
        //es.ajouterEmploye(e1);
        //es.modifierEmploye(2,"kamel","ala","serveur",2300);
        //es.supprimerEmploye(1);
        //System.out.println(es.consulterEmploye());
         //System.out.println(es.consulterSalaire(5).afficherSalaire());
         //System.out.println(es.trieEmploye("salaire"));
         System.out.println(es.rechercheEmploye("prenom","cri"));



    }
    
}

package modelo;
// Generated 18/08/2021 08:18:31 PM by Hibernate Tools 4.3.1



/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private int id;
     private String nom;

    public Empleado() {
    }

    public Empleado(int id, String nom) {
       this.id = id;
       this.nom = nom;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }




}



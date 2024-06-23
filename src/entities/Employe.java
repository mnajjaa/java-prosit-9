package entities;

import java.util.Comparator;

public class Employe implements Comparable<Employe>{

    //les attributs
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement ;
    private int grade ;

    //les constructeurs
    public Employe(){}
    public Employe(int id, String nom, String prenom, String nomDepartement, int grade){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    //les getters et les setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
            if (obj instanceof Employe e)
        {
            return this.id==e.id && this.nom.equals(e.nom);
        }return false;
    }

    @Override
    public String toString(){
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomDepartement=" + nomDepartement + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Employe employe){
        return this.id-employe.id;
    }



}

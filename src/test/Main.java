package test;

import entities.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet departementHashSet = new DepartementHashSet();
        SocieteArrayList emp =new SocieteArrayList();

        Departement d1 =new Departement(1, "informatique", 3000);
        Departement d2 =new Departement(2, "finance", 7000);
        Departement d3 =new Departement(3, "RH", 5000);
        Departement d4 =new Departement(4, "developper", 1000);
        Departement d5 =new Departement(5, "security", 4200);

        Employe e1= new Employe(1,"mohsen","benselem","informatique",33);
        Employe e2= new Employe(2,"ihsen","benselem","finance",22);
        Employe e3= new Employe(3,"gul","arslan","RH",44);
        Employe e4= new Employe(4,"baderhan","arslan","finance",55);
        Employe e5= new Employe(5,"mohsen","benselem","developper",66);
        Employe e6= new Employe(6,"mohsen","benselem","finance",77);
        Employe e7= new Employe(7,"mohsen","benselem","RH",88);
        Employe e8= new Employe(8,"mohsen","benselem","informatique",99);


//departementHashSet.ajouterDepartement(d1);
//departementHashSet.ajouterDepartement(d2);
//departementHashSet.ajouterDepartement(d3);
//departementHashSet.ajouterDepartement(d4);
//
//departementHashSet.displayDepartement();

System.out.println("///////////////////////////////");

//emp.ajouterEmploye(e1);
//emp.ajouterEmploye(e2);
//emp.ajouterEmploye(e3);
//emp.ajouterEmploye(e4);
//emp.displayEmploye();

        System.out.println("///////////////////////////////");

///istancier la class qui contient HashMap
        AffectationHashMap aff =new AffectationHashMap();
        aff.ajouterEmployeDepartement(e1,d3);
        //aff.ajouterEmployeDepartement(e1,d3);
        aff.ajouterEmployeDepartement(e2,d4);
        aff.ajouterEmployeDepartement(e3,d2);

//aff.afficherEmployesEtDepartements();

//bch ntasti tri
        //houni trierMap() trajaali TreeMap<Employe, Departement> donc nheb n3ayet l affichage b expr Lambda !!
        //houni TeeMap naccepte pas les doublons donc aka aaleh faskhetli e4 haseb l hashCode o equals ken jew mch redeffinie rw b9aw aady
     aff.trierMap().forEach((a,b)-> System.out.println(a+" ++ "+b));









    }
}
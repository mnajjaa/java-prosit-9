package entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> maliste ;
    public SocieteArrayList(){
        maliste = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e){
        maliste.add(e);
    }


    @Override
    public boolean rechercherEmploye(String nom){
  // method 1
//        for (Employe e:maliste)
//        if (e.getNom().equals(nom))
//            return true;
//        return false;
        ///////////////////////////////////////////////////////////////////
        // method2
        for (int i =0 ; i<maliste.size() ;i++) {
            if (maliste.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe e){
    return maliste.contains(e);
    }
    @Override
    public void supprimerEmploye(Employe e){
        maliste.remove(e);
    }
    @Override
    public void displayEmploye(){
    System.out.println(maliste);
    }


    @Override
    public void trierEmployeParId(){
        //Comparable
        Collections.sort(maliste);
    }



    @Override
    public void trierEmployeParNomDépartementEtGrade(){
        //Comparator
        Comparator <Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade()- o2.getGrade();

            }
        };

        Comparator<Employe> nomDepComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };
        Collections.sort(maliste, nomDepComparator.thenComparing(gradeComparator));
    }


}

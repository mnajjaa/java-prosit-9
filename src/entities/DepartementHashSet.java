package entities;

import java.util.*;


public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departSet = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
    departSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d:departSet)
            if(d.getNomDept().equals(nom))
                return true;
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
    departSet.remove(departement);
    }


    @Override
    public void displayDepartement() {
        // le display dun Set est un peu special !!
        // creation d'un itrator pour parcourir les elements du hashSet departSet
        Iterator<Departement> itr = departSet.iterator();

        //baad naamlou boucle while pour parcourir le hashset tant qu'il y a des elements suivants
        while (itr.hasNext()){
            //affichage de l'element suivant dans le console
            System.out.println(itr.next());
        }
    }

    //houni el treeSet dima lezemha un critere de tri
    //soit bl Comparator donc houni naaml comparator o redifition mtaa compare "l profa fl expl khedmetha bl Lamda"
    //soit bl Comparable 1. nemchy nimplimenteha fl class Departement car
    //l hashSet est de type Departement ghadika zeda naamel l override mtaa
    //compareTo o njee nzydha houni nestaamelha khw haka TreeSet<>(departSet);
    @Override
    public TreeSet<Departement> trierDepartementById() {
        //methode 1using comparable

        //houni le critere de tri fl classe Departement, TreeSet<>(departSet)
        // o houni sabyna l departSet f woset TreeSet khaterrha vide athyka
        //   return new TreeSet<>(departSet);

        //methode 2 using comparator
        TreeSet<Departement> departementTreeSet = new TreeSet<>(new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId()-o2.getId();
            }
        });
        //kif kif houni sabyna departSet f woset TreeSet khaterrha vide zeda athyka
        departementTreeSet.addAll(departSet);
        return departementTreeSet;

        //najem zeda using Lamda
    }
}

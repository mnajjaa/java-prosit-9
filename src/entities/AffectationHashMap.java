package entities;

import java.util.*;

public class AffectationHashMap {
    //creating a hashMap 1
   // Map<Employe, Departement> affectEmp = new HashMap<>();

    //ou haka 2
    Map<Employe, Departement> affectEmp ;//new HashMap<>();

    public AffectationHashMap() {

        affectEmp = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d)
    {
        affectEmp.put(e, d);
        //affectEmp.putIfAbsent(e, d);
    }

    //looping and displaying both keys and values
    public void afficherEmployesEtDepartements (){

     //*****avec entrySet
 //        for (Map.Entry<Employe, Departement> ent:affectEmp.entrySet()){
//            System.out.println(ent.getKey()+"   :  "+ent.getValue());
//   houni ken nheb ken les noms ---> System.out.println(ent.getKey().getNom()+"   :  "+ent.getValue());
//        }

      //******avec keySet
//      for (Employe e: affectEmp.keySet()) //affectEmp heya map donc nappliqui aaleha keySet()
//      {// baad l e nappliki aaleha e.getKey() eli heya method de l'interface interne mtaa l map map.Entry<K,V>
//          //et puis pour chaque objet e f woset l'ensemble
//          System.out.println(e+"++"+affectEmp.get(e));
//      }

        //******avec forEach ama 9dima o zeyd
//        affectEmp.entrySet().forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));

      //********avec forEach profetna
    affectEmp.forEach((k,v)-> System.out.println(k + "***" + v));
    }

    public  void supprimerEmploye (Employe e) {
        affectEmp.remove(e);
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        affectEmp.remove(e,d);
    }




    //looping and displaying keys
    public void afficherEmployes(){
        Set<Employe> employes= affectEmp.keySet();

        //***********using for
        for (Employe emp:employes){
            System.out.println("the key using for : "+emp);
        }

        //***********using an iterator
        Iterator<Employe> itr =affectEmp.keySet().iterator();
        while (itr.hasNext()){
            System.out.println("the key using iterator : "+itr);
        }

        //*********fama using foreach zeda tw narj3elha baad !!
      affectEmp.keySet().forEach(employe -> System.out.println("the key : "+ employe));
    }


    //looping and displaying values
    //houni psq values() renvoie une Collection donc on a crée une Collection nsobouha feha
    public void afficherDepartements(){
        //******using boucle for
        Collection<Departement> values = affectEmp.values() ;
        for (Departement vl:values){
            System.out.println("value : "+values);
        }
        //*******fama using foreach zeda !!
        affectEmp.forEach((k,v)-> System.out.println(v));
        //********same
        affectEmp.values().forEach(d-> System.out.println(d));
    }

public boolean rechercherEmploye (Employe e){
        affectEmp.containsKey(e);
    return false;
}

public boolean rechercherDepartement (Departement d) {
        affectEmp.containsValue(d);
        return false;
}



   public TreeMap<Employe, Departement> trierMap(){
//**********using Comparable
// psq howa tri selon l id donc houni lezem n implementi Compbarable fl class Employe et naamel l @Override
//        return new TreeMap<>(affectEmp);

        //**********using Comparator
       Comparator<Employe> idComparator = new Comparator<Employe>(){
           @Override
           public int compare(Employe e1 , Employe e2){
               return e1.getId()-e2.getId();
           }
       };
       TreeMap<Employe, Departement> tree =new TreeMap<>(idComparator);
       tree.putAll(affectEmp);
       return tree;

       //********o najem zeda using Lamda Expr et methode de reference !!

       // snaat TreeMap initilalemnt maabya b affectEmp sabyt l hashMap f woset TreeMap
       //*****1. par l'implementation de l'interface fonctionnelle Comparator
//TreeMap<Employe, Departement> tre= new TreeMap<>((a,b)->a.getId()-b.getId());

       //**** ou bien kif kif par l'implementation de l'interface fonctionnelle Comparator using method de reference bch ysyrelha cast o temchy shiha
       //voir note fl karassa concernant cet exemple
//TreeMap<Employe, Departement> tre= new TreeMap<>(Comparator.comparing(Employe::getId));
//return tre;

   }




    }



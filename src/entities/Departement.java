package entities;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDept;
    private int nbEmploye;

    public Departement() {
    }

    public Departement(int id, String nomDept, int nbEmploye) {
        this.id = id;
        this.nomDept = nomDept;
        this.nbEmploye = nbEmploye;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nbEmploye;
        result = 31 * result + nomDept.hashCode();
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    @Override
    public boolean equals(Object obj)
    {if (this == obj) return true;
        if (obj instanceof Departement d ) {
            return this.id == d.id && this.nomDept.equals(d.nomDept);
        }   return false;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDept='" + nomDept + '\'' +
                ", nbEmploye=" + nbEmploye +
                '}';
    }


    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}

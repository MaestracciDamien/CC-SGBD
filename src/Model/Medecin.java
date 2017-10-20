package Model;

public class Medecin extends Utilisateurs {
    private int id;
    private int salaire;

    public Medecin(int id, int numeroSecu, String nom, String prenom, int id1, int salaire) {
        super(id, numeroSecu, nom, prenom);
        this.id = id1;
        this.salaire = salaire;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}

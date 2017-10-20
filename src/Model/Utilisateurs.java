package Model;

public class Utilisateurs {
    private int id;
    private int numeroSecu;
    private String nom;
    private String prenom;


    public Utilisateurs(int id, int numeroSecu, String nom, String prenom) {
        this.id = id;
        this.numeroSecu = numeroSecu;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(int numeroSecu) {
        this.numeroSecu = numeroSecu;
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
}

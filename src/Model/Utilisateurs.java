package Model;

/**
 *Utilisateur's class witch represents the patient
 * 
 * @author Ponceau Nathanael
 * @author Maestracci Damien
 * @author Konate Mariam
 */
public class Utilisateurs {
	
	//id user 
    private int id;
    
    // social number
    private int numeroSecu;
    
    // username
    private String nom;
    
    // user last name
    private String prenom;


    /**
     * Constructor of user
     * 
     * @param id id user
     * @param numeroSecu social number
     * @param nom username
     * @param premon user last name
     */
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

    @Override
    public String toString() {
        return "Utilisateurs{" +
                "id=" + id +
                ", numeroSecu=" + numeroSecu +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

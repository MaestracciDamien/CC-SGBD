package Model;

/**
 * Medecin's class witch represents the medecin and extends Utilisateurs
 * 
 * @author Ponceau Nathanael
 * @author Maestracci Damien
 * @author Konate Mariam
 */
public class Medecin extends Utilisateurs {
	
	// doctor id
    private int id;
    
    // doctor salary
    private int salaire;

    /**
     * Constructor of Medecin
     * 
     * @param id id user
     * @param numeroSecu social number
     * @param nom username
     * @param prenom user last name
     * @param id1 user linked to doctor
     * @param salaire doctor salary
     */
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

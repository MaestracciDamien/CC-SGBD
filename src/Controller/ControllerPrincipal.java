package Controller;

import Model.Utilisateurs;

import java.sql.*;

public class ControllerPrincipal {

    private final String addr = "jdbc:mysql://127.0.0.1:8889/sgbd-cc";
    private final String name = "root";

    // user passsword
    private final String password = "root";

    // Connection object
    private Connection conn;

    /**
     * Constructor of the controler
     * who make the connection to the database
     *
     */
    public ControllerPrincipal() throws Exception {
        //view = new TheView();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex1) {
            System.out.println("Pilote non trouver");
            System.exit(1);
        }

        try {
            conn = DriverManager.getConnection(addr, name, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * allow to make an apointement
     *
     * @param nom user name
     * @param prenom user last name
     * @param numSecu social number
     * @param idAnalyse represent the type of analyse wanted by the patient
     */
    public void reserverVisite(String nom, String prenom, int numSecu, int idAnalyse) throws Exception {
        Utilisateurs user = selectUtilisateurs(numSecu, nom, prenom);
        if (user == null){
            throw new Exception("utilisateurs incorrect");
        }




    public Utilisateurs selectUtilisateurs(int numeroSecu, String nom, String prenom) throws SQLException {
        Utilisateurs retour = null;
        PreparedStatement prep = conn.prepareStatement("Select * from Utilisateurs where  numeroSecu = ? AND nom = ? AND prenom= ?; ");
        prep.setInt(1, numeroSecu);
        prep.setString(2, nom);
        prep.setString(3, prenom);
        ResultSet res = prep.executeQuery();
        while (res.next()) {
            for (int i = 1; i < res.getMetaData().getColumnCount(); i++) {
                retour = new Utilisateurs(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4));
            }
        }
        prep.close();

        return retour;
    }
    public Utilisateurs selectAnalyse(int numeroSecu, String nom, String prenom) throws SQLException {
        Utilisateurs retour = null;
        PreparedStatement prep = conn.prepareStatement("Select * from Utilisateurs where  numeroSecu = ? AND nom = ? AND prenom= ?; ");
        prep.setInt(1, numeroSecu);
        prep.setString(2, nom);
        prep.setString(3, prenom);
        ResultSet res = prep.executeQuery();
        while (res.next()) {
            for (int i = 1; i < res.getMetaData().getColumnCount(); i++) {
                retour = new Utilisateurs(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4));
            }
        }
        prep.close();

        return retour;
    }

    public static void main(String args[]) {
        try {
            ControllerPrincipal programme = new ControllerPrincipal();
            System.out.println(programme.selectUtilisateurs(21607739,"MAESTRACCI","DAMIEN"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

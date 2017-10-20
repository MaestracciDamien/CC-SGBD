package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ControllerPrincipal's class witch represents the main controler
 * 
 * @author Ponceau Nathanael
 * @author Maestracci Damien
 * @author Konate Mariam
 */
public class ControllerPrincipal {

	// database adress
    private final String addr = "jdbc:mysql://127.0.0.1:8889/sgbd-cc";
    
    // user name
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
     * @param premon user last name
     * @param numSecu social number
     * @param idAnalyse represent the type of analyse wanted by the patient
     */
    public void reserverVisite(String nom, String prenom, int numSecu, int idAnalyse)
    {

    }


    /**
     * main function witch run the controller and the view
     */
    public void main(){
        try {
            ControllerPrincipal programme = new ControllerPrincipal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

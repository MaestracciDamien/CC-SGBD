package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ControllerPrincipal {

    private final String addr = "jdbc:mysql://127.0.0.1:8889/sgbd-cc";
    private final String name = "root";
    private final String password = "root";

    private Connection conn;
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

    public void reserverVisite(String nom, String prenom, int numSecu, int idAnalyse)
    {

    }


    public void main(){
        try {
            ControllerPrincipal programme = new ControllerPrincipal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

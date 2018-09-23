package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henry.hernandez
 */
public class ConexionBD {

    /* Campos de la clase */
    
    private final String BASEDATOS = "SBIBD4";
    private final String USUARIO = "SBIB";
    private final String CLAVE = "SBIB";
    private final String DRIVER = "oracle.jdbc.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@10.3.1.40:1521:"+BASEDATOS;

    /***********************/
    /* Métodos de la clase */
    /***********************/
    
    // Abre una conexión a la base de datos y retorna dicha conexión.
    public Connection getConexion () {
        
        Connection conexionBD = null;
        
        try {
            Class.forName(DRIVER);
            conexionBD = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexionBD;
    }
}

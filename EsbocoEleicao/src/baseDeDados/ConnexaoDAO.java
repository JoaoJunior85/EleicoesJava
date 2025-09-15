
package baseDeDados;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexaoDAO {
    public Connection conexaobase(){
    Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/eleicao?user=root&password=manu123@$";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO"+ e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args){

        
    }
    
}

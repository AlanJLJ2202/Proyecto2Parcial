
package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AJLJ-
 */
public class ConexionSQL {
   



    private static ConexionSQL instance;
    private Connection con=null;
    private Statement  statemen;
    private ResultSet resultSet;
    
    
    public ConexionSQL(){}
    
    public static ConexionSQL Instance(){
        if(instance == null)
            instance =  new ConexionSQL();
        return instance;
    }
    public void ConectarDB(){
        try{
            con = DriverManager.getConnection("jdbc:sqlserver://;database=dbFarmacias;integratedSecurity=true;");
            System.out.print("Conectado");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
        
    }
    
    private void DesconectarDB(){
        try{
          
          resultSet.close();
          statemen.close();
          con.close();
          
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la desconexion: " + ex.getMessage()); 
        }
    }
    
    public DefaultTableModel Query(String query){
        try{
            ConectarDB(); //Conectar la base de datos 
            
            statemen = con.createStatement();
            
            resultSet = statemen.executeQuery(query);
            Vector<String> columnNames =  new Vector<String>();
            int columnCount = resultSet.getMetaData().getColumnCount();
            for(int column = 1; column <= columnCount; column++){
                columnNames.add(resultSet.getMetaData().getColumnName(column));
            }
            Vector<Vector<Object>> data =  new Vector<Vector<Object>>();
            while(resultSet.next()){
                Vector<Object> vector = new Vector<Object>();
                for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++){
                    vector.add(resultSet.getObject(columnIndex));
                }
                data.add(vector);
            }
            return new DefaultTableModel(data, columnNames);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
             return null;
        }finally {
            DesconectarDB();
        }
    }
    public int Execute(String query){
        try{
         ConectarDB();
         statemen = con.createStatement();
         return statemen.executeUpdate(query);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error en el comando: " + e.getMessage()); 
           return 0;
        }finally{
            DesconectarDB();
        }
    }
    
    public void Prueba(){
        try {
  String connectionUrl = "jdbc:sqlserver://;database=dbFarmacia;integratedSecurity=true;";
  con = DriverManager.getConnection(connectionUrl);
  System.out.println("Conectado.");
} 
catch (SQLException ex) 
{
  System.out.println("Error.");
}
        
    }
    
    
    
    
    
    
    
}

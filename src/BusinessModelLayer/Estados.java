
package BusinessModelLayer;

import DataAccessLayer.ConexionSQL;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AJLJ-
 */
public class Estados {
    private ConexionSQL dataAccess = ConexionSQL.Instance();
    
   private int idEstado;
   private String estado;
   
   public Estados(){
       
   }

    public Estados(int idEstado, String estado) {
        this.idEstado = idEstado;
        this.estado = estado;
    }

    public ConexionSQL getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(ConexionSQL dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    public DefaultTableModel GetAllModel(){
        String query = "SELECT * FROM dbo.Estados";
        return dataAccess.Query(query);
    }
   
    public boolean add(){
        String query = "INSERT INTO dbo.Estados(estado) " +
                "VALUES('" + estado + "');";
        return dataAccess.Execute(query) >= 1;        
    }
    
    
     public boolean Update(){
    //update tabla set c1=v1 c2=v2 c3=v3;    
        String query = "UPDATE dbo.Estados SET " +
                
                "estado = '" + estado + "' " +
                
               
                "WHERE idEstado = " + idEstado;      
        return dataAccess.Execute(query) >= 1; 
    }
    
     public boolean Delete(){
        String query = "DELETE FROM dbo.Estados WHERE idEstado = " + idEstado;
        return dataAccess.Execute(query) >= 1; 
    }
     
       public void GetById(){
        String query =  "SELECT * FROM dbo.Estados WHERE idEstado = " + idEstado;
        DefaultTableModel res = dataAccess.Query(query);
        idEstado= (int)res.getValueAt(0, 0);
        estado = (String)res.getValueAt(0, 1);
        
        
    }
}

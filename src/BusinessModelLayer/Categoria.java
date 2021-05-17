
package BusinessModelLayer;
import DataAccessLayer.ConexionSQL;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AJLJ-
 */
public class Categoria {
    
    private ConexionSQL dataAccess = ConexionSQL.Instance();
    private int idCategoria;
    private String nombre;
    private int activo;
    
    public Categoria(){
        
        
    }

    public Categoria(int idCategoria, String nombre, int activo) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.activo = activo;
    }

    public ConexionSQL getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(ConexionSQL dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
       public DefaultTableModel GetAllModel(){
        String query = "SELECT * FROM dbo.Categorias";
        return dataAccess.Query(query);
    }
   
    public boolean add(){
        String query = "INSERT INTO dbo.Categorias(idCategoria, nombre, activo) " +
                "VALUES(" + idCategoria + ",'" + nombre + "'," + activo + ");";
        return dataAccess.Execute(query) >= 1;        
    }
    
    
     public boolean Update(){
    //update tabla set c1=v1 c2=v2 c3=v3;    
        String query = "UPDATE dbo.Categorias SET " +
                "idCategoria = " + idCategoria + ", " +
                "nombre = '" + nombre + "', " +
                "activo = " + activo + " " +
                "WHERE idCategoria = " + idCategoria;      
        return dataAccess.Execute(query) >= 1; 
    }
    
     public boolean Delete(){
        String query = "DELETE FROM dbo.Categorias WHERE idCategoria = " + idCategoria;
        return dataAccess.Execute(query) >= 1; 
    }
     
       public void GetById(){
        String query =  "SELECT * FROM dbo.Categorias WHERE idCategoria = " + idCategoria;
        DefaultTableModel res = dataAccess.Query(query);
        idCategoria= (int)res.getValueAt(0, 0);
        nombre = (String)res.getValueAt(0, 1);
        activo = (int)res.getValueAt(0, 2);
       
        
    }
    
}

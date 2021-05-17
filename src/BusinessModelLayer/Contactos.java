
package BusinessModelLayer;

import DataAccessLayer.ConexionSQL;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AJLJ-
 */
public class Contactos {
    private ConexionSQL dataAccess = ConexionSQL.Instance();
    
    private int idContacto;
    private String nombre;
    private int codigoPostal;
    private int entidad;
    private int comuna;
    private String calle;
    private int telefono;
    
    public Contactos(){
        
    }

    public Contactos(int idContacto, String nombre,int codigoPostal, int entidad, int comuna, String calle, int telefono) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.entidad = entidad;
        this.comuna = comuna;
        this.calle = calle;
        this.telefono = telefono;
    }

    public ConexionSQL getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(ConexionSQL dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getEntidad() {
        return entidad;
    }

    public void setEntidad(int entidad) {
        this.entidad = entidad;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public DefaultTableModel GetAllModel(){
        String query = "SELECT * FROM dbo.Contactos";
        return dataAccess.Query(query);
    }
   
    public boolean add(){
        String query = "INSERT INTO dbo.Contactos(nombre, codigoPostal, entidad, comuna, calle, telefono) " +
                "VALUES('" + nombre +"', " + codigoPostal + "," + entidad + "," + comuna + ",'" + calle + "'," + telefono + ");";
        return dataAccess.Execute(query) >= 1;        
    }
    
    
     public boolean Update(){
    //update tabla set c1=v1 c2=v2 c3=v3;    
        String query = "UPDATE dbo.Contactos SET " +
                
                "nombre = '" + nombre + "', " +
                "codigoPostal = " + codigoPostal + ", " +
                "entidad = " + entidad + ", " +
                "comuna = " + comuna + ", " +
                "calle = '" + calle + "', " +
                "telefono = " + telefono + " " +
                
                "WHERE idContacto = " +idContacto;      
        return dataAccess.Execute(query) >= 1; 
    }
    
     public boolean Delete(){
        String query = "DELETE FROM dbo.Contactos WHERE idContacto = " + idContacto;
        return dataAccess.Execute(query) >= 1; 
    }
     
       public void GetById(){
        String query =  "SELECT * FROM dbo.Contactos WHERE idContacto = " + idContacto;
        DefaultTableModel res = dataAccess.Query(query);
        idContacto= (int)res.getValueAt(0, 0);
        nombre = (String)res.getValueAt(0, 1);
        codigoPostal = (int)res.getValueAt(0, 2);
        entidad = (int)res.getValueAt(0, 3);
        comuna = (int)res.getValueAt(0, 4);
        calle = (String)res.getValueAt(0, 5);
        telefono = (int)res.getValueAt(0, 6);
        
        
    }
    
}

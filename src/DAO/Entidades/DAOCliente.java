package DAO.Entidades;

import DAO.DAO;
import conexion.baseDatos;
import entidades.cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class DAOCliente implements DAO{
baseDatos bd = new baseDatos();
    @Override
    public boolean agregar(Object o) {
     boolean result = false;
        try {            
            cliente client = (cliente) o;
            bd.abrirConexion();            
            String consulta="INSERT INTO cliente (nombre,nControl,email,telefono,direccion) VALUES ("
                    +"'"+client.getNombre()+"',"
                    +"'"+client.getnControl()+"'," 
                    +"'"+client.getEmail()+"'," 
                    +"'"+client.getTelefono()+"'," 
                    +"'"+client.getDireccion()+"'"                                       
                    +")";            
            result = bd.ejecutarComando(consulta);
        } catch (Exception e) {            
            
        }finally{
            bd.cerrarConexion();
        }
        return result;
    }

    @Override
    public boolean editar(Object o) {
    boolean result = false;
        try {
            cliente client = (cliente) o;
            bd.abrirConexion();
            String consulta = "UPDATE cliente SET "
                    + " nombre = '"+client.getNombre()+"',"
                    + " nControl = '"+client.getnControl()+"', "
                    + " email = '"+client.getEmail()+"', "
                    + " telefono = '"+client.getTelefono()+"', "
                    + " direccion = '"+client.getDireccion()+"'"
                    + " WHERE id = "+client.getId();
            
            result = bd.ejecutarComando(consulta);
            
        } catch (Exception e) {
        }finally{
            bd.cerrarConexion();
        }
        
        return result;
    }

    @Override
    public boolean eliminar(int id) {
    boolean result = false;
     
        try {
            bd.abrirConexion();
            
            String consulta = "DELETE FROM cliente WHERE id="+id;
            
            result = bd.ejecutarComando(consulta);
            
        } catch (Exception e) {
        }finally{
            bd.cerrarConexion();
        }
    
     return result;
    }

    @Override
    public List<Object> buscar() {
    List<Object> client = new ArrayList();
    
        try {
            bd.abrirConexion();
            String consulta ="SELECT * FROM cliente";
            
            ResultSet rs = bd.consultarDatos(consulta);
            while(rs.next()){
                cliente c = new cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setnControl(rs.getInt("nControl"));
                c.setEmail(rs.getString("email"));
                c.setTelefono(rs.getString("telefono"));
                c.setDireccion(rs.getString("direccion"));
                
                client.add(c);
            }
            
        } catch (Exception e) {
        }finally{
            bd.cerrarConexion();
        }       
       return client;
    }

    @Override
    public Object BuscarID(int id) {
     cliente c = new cliente();
    try {
            bd.abrirConexion();
            String consulta ="SELECT * FROM cliente WHERE id="+id;
            
            ResultSet rs = bd.consultarDatos(consulta);
            if(rs.next()){                
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setnControl(rs.getInt("nControl"));
                c.setEmail(rs.getString("email"));
                c.setTelefono(rs.getString("telefono"));
                c.setDireccion(rs.getString("direccion"));                
            }
            
        } catch (Exception e) {
        }finally{
            bd.cerrarConexion();
        }       
       return c;
    }

}



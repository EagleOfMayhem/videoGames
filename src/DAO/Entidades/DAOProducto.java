package DAO.Entidades;

import DAO.DAO;
import conexion.baseDatos;
import entidades.producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class DAOProducto implements DAO{
baseDatos bd = new baseDatos();
    @Override
    public boolean agregar(Object o) {
    boolean result = false;
        try {            
            producto product = (producto) o;
            bd.abrirConexion();            
            String consulta="INSERT INTO producto (codigoProducto,nombreProducto,precio,inventario) VALUES ("
                    +"'"+product.getCodigoProducto()+"',"
                    +"'"+product.getNombreProducto()+"'," 
                    +"'"+product.getPrecio()+"'," 
                    +"'"+product.getInventario()+"'"                                       
                    +")";            
            result = bd.ejecutarComando(consulta);
        } catch (Exception e) {            
            
        }finally{
            bd.cerrarConexion();
        }
        return result;}

    @Override
    public boolean editar(Object o) {
   boolean result = false;
        try {
            producto product = (producto) o;
            bd.abrirConexion();//+"nombre,email,semestre,carrera)"
            String consulta = "UPDATE producto SET "
                    + " codigoProducto = '"+product.getCodigoProducto()+"',"
                    + " nombreProducto = '"+product.getNombreProducto()+"', "
                    + " precio = '"+product.getPrecio()+"', "
                    + " inventario = '"+product.getInventario()+"'"
                    + " WHERE id = "+product.getId();
            
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
            
            String consulta = "DELETE FROM producto WHERE id="+id;
            
            result = bd.ejecutarComando(consulta);
            
        } catch (Exception e) {
        }finally{
            bd.cerrarConexion();
        }
    
     return result; }

    @Override
    public List<Object> buscar() {
    List<Object> product = new ArrayList();    
        try {
            if(bd.abrirConexion()){
                String consulta ="SELECT * FROM producto";
            
            ResultSet rs = bd.consultarDatos(consulta);
            while(rs.next()){
                producto p = new producto();
                p.setId(rs.getInt("id"));
                p.setCodigoProducto(rs.getInt("codigoProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setPrecio(rs.getDouble("precio"));
                p.setInventario(rs.getInt("inventario"));
               
                product.add(p);
                
            }
            
            }else{
                System.out.println("No entro la consulta");
            }           
        } catch (Exception e) {
            
        }finally{
            bd.cerrarConexion();
        }       
       return product;
    }

    @Override
    public Object BuscarID(int id) {
    producto p = new producto();
    try {
            bd.abrirConexion();
            String consulta ="SELECT * FROM producto WHERE id="+id;
            
            ResultSet rs = bd.consultarDatos(consulta);
            if(rs.next()){                
                p.setId(rs.getInt("id"));
                p.setCodigoProducto(rs.getInt("codigoProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setPrecio(rs.getDouble("Precio"));
                p.setInventario(rs.getInt("inventario"));   
                                
            }
            
        } catch (Exception e) {
        }finally{
            bd.cerrarConexion();
        }    
        
       return p;
    }
    
   

  
}

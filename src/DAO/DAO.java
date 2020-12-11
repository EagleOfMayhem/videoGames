package DAO;

import entidades.producto;
import java.util.List;

/**
 *
 * @author Andre
 */
public interface DAO {
    public boolean agregar (Object o);    
    public boolean editar (Object o);
    public boolean eliminar (int id);
    public List<Object> buscar ();
    public Object BuscarID (int id);
   
}

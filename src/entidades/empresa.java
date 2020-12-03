package entidades;

/**
 *
 * @author Andre
 */
public class empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private int totalProductos;

    public empresa(String nombre, String direccion, String telefono, int totalProductos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.totalProductos = totalProductos;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

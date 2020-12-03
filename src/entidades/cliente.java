package entidades;

/**
 *
 * @author Andre
 */
public class cliente {
    private int id;
    private String nombre;
    private int nControl;
    private String email;
    private String telefono;
    private String direccion;

    public cliente(){
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnControl() {
        return nControl;
    }

    public void setnControl(int nControl) {
        this.nControl = nControl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

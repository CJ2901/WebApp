/*
Se convertirá en una clase de entidad para interactuar con el API de JPA hacia la base de datos
*/
package per.cj.sga.domain;
 
import java.io.Serializable;
import javax.persistence.*;

// En la clase de Entity se pueden definir querys ("named queries")
@Entity
@NamedQueries({
    @NamedQuery(name="Persona.findAll",query="SELECT p FROM Persona p ORDER BY p.idPersona") //No es SQL, es JPQL. Recupera objetos completos de la base de datos (NO COLUMNAS)
})
@Table(name="persona")
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    
    // Agregamos los atributos de nuestra clase
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int idPersona;
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    // Se añade un constructor vacio
    public Persona() {
    }
    
    // Se añade un constructor que reciba todos los argumentos
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    // Métodos get y set
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    // Método tostring

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}

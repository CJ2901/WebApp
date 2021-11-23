package per.cj.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import per.cj.sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {

    // Métodos para trabajar con persona
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    
    // La razon de ser de la interfaz es para acceder a la capa de datos, interactuar con la base de datos y hacer las interacciones
    
}

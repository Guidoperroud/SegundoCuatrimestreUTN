package practica7;
import java.util.HashMap;

public class Agenda extends Exception {
    private HashMap<String ,String> agenda = new HashMap<>();

public void agregarContacto(String nombre, String telefono) throws AgendaException{
    for (String clave : agenda.keySet()) {
        if (agenda.containsKey(nombre.toLowerCase())) {
            throw new AgendaException("Boludito ya tenes un contacto con el mismo nombre.");            
        }
    
    }
       if (nombre==null) {
           throw new AgendaException("El nombre esta vacio boludo.");
        } 
        if (telefono==null || telefono.length()<7) {
            throw new AgendaException("El telefono debe tener como minimo 7 digitos.");
        }
        agenda.put(nombre, telefono);
        System.out.println("El contacto fue agregado correctamente.");
    }

public String buscarTelefono(String nombre) throws AgendaException{

        if (nombre==null) {
           throw new AgendaException("El nombre esta vacio boludo.") ;
        }
    for (String clave : agenda.keySet()) {
        if (!agenda.containsKey(nombre.toLowerCase())) {
            throw new AgendaException("boludito no esta el nombre en la agenda.");           
        }
    }
    String buscado = agenda.get(nombre);
    System.out.println("El telefono que buscas es: " + buscado);
    return buscado;
}

public void eliminarContacto(String nombre) throws AgendaException{
    for (String clave : agenda.keySet()) {
        if (!agenda.containsKey(nombre.toLowerCase())) {
            throw new AgendaException("Boludito no esta ese contacto.");
        }
    }
    String eliminado = agenda.remove(nombre);
    System.out.println("El contacto " + eliminado + "fue eliminado correctamente.");
}

public void mostrarTodosLosContactos(){
    
    for (String nombre : agenda.keySet()) {
    String numero = agenda.get(nombre);
    System.out.println("Nombre del contacto: " + nombre);
    System.out.println("Telefono: " + numero);
   }
}
}

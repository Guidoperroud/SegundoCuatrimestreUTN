package practica5;

public class Videojuego {

    private String genero;
    private String nombre;

    public Videojuego(String genero, String nombre){
        this.nombre= nombre;
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }

    public String getNombre(){
        return nombre;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre de videojuego: " + nombre + "Genero: " + genero;
    }
}

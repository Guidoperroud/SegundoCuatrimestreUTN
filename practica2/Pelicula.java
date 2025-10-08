import java.io.StreamCorruptedException;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private boolean vista;

    public Pelicula(String titulo, String director, int duracion, boolean vista) {

        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.vista = vista;
    }

    public Pelicula(String titulo, String director, int duracion) {

        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String director){

        this.titulo=titulo;this.director=director;

}

    public void setTitulo(String titulo){
        this.titulo=titulo;
        if (titulo.isEmpty() || titulo== null) {
            this.titulo="El titulo no puede estar vacio!!";
        }
    }

    public String getTitulo(String titulo){
        return this.titulo;
    }

    public void setDirector(String director){
        this.director=director;
    }
    
    public String getDirector(String director){
        return this.director;
    }
   
    public void setDuracion(int duracion){
        this.duracion=duracion;

        if (duracion<=0) {
            this.duracion="La pelicula debe tener una duracion!!";
        }
    }

    public int getDuracion(int duracion){
        return this.duracion;
    }

    public void setVista(boolean vista){
        this.vista=vista;
    }

    public boolean getVista(boolean vista){
        return this.vista;
    }

    public void marcarcomovista(boolean vista){

        this.vista=true;
    }

    @Override

    public String toString(){

        return "Pelicula{titulo='"+ titulo + "', Director='" +  director + ", Duracion=" + duracion + ", vista" + vista + "}";
    }
}
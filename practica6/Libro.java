package practica6;

public class Libro {
    protected String titulo;
    protected String autor;
    protected boolean disponible;

    public Libro (String titulo, String autor, boolean disponible){
        this.titulo=titulo;
        this.autor=autor;
        this.disponible=disponible;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(String titulo){
        return titulo;
    }

    public boolean getDisponible(boolean disponible){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    @Override
    public String toString(){
        return  "Titulo: " + titulo + "Autor: " + autor + "Disponibilidad: " + disponible;
    }
}

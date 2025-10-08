package practica4;

public class Publicacion {
    private String titulo;
    private int anio;
    private boolean disponible;

    public Publicacion (String titulo, int anio){
        this.titulo=titulo;
        this.anio=anio;
    }

    public String getTitulo(String titulo){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public boolean Prestar(boolean disponible){
        if (disponible) {
            disponible=false;
        }
        return true;
    }

    public void Devolver(boolean disponible){
        if (!disponible) {
            disponible=true;
        }
    }

    public boolean estaDisponible(boolean disponible){
        return disponible;
    }

    public String mostrarInfo(String titulo, int anio, boolean disponible){
        return "Titulo: " + titulo + "Anio de edicion: " + anio + "Disponibilidad: " + (disponible ? "si" : "no");
    }

}

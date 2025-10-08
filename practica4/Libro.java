package practica4;

public class Libro extends Publicacion{
    private String autor;
    private int paginas;

    public String getAutor(String autor){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public Libro(String titulo, int anio, String autor, int paginas){
        super(titulo, anio);
        this.autor=autor;
        this.paginas=paginas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print("Autor: " + autor);
        System.out.print("Paginas: " + paginas);
    }
}

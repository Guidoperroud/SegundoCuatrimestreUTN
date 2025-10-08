package practica4;

public class Instrumento {
    protected String nombre;
    protected String marca;
    protected double precio;

    public Instrumento(String nombre, String marca, double precio){
        this.nombre=nombre;
        this.marca=marca;
        this.precio=precio;
    }

    public String Tocar(){
        return "Tocando " + nombre + " de marca " + marca;
    }

    public String Afinando(){
        return "Afinando " + nombre + " de marca " + marca;
    }

    public String MostrarInfo(){
        return "Nombre del instrumento: " + nombre + " Marca: " + marca + " Precio: " + precio;  
    }

    public String getNombre(String nombre){
        return nombre;
    }

    public String getMarca(String marca){
        return marca;
    }

    public double getPrecio(double precio){
        return precio;
    }

}

package practica8.ListaComprasAvanzada;

public class Productos {
    private String nombre;
    private categoria categoria;
    private Double precio;
    private int cantidad;

    public Productos(String nombre, categoria categoria, Double precio, int cantidad){
        this.cantidad=cantidad;
        this.categoria=categoria;
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre(){
        return nombre;
    }

    public categoria getCategoria(){
        return categoria;
    }

    public Double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
        public void setCategoria(categoria categoria){
        this.categoria=categoria;
    }
        public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
        public void setPrecio(Double precio){
        this.precio=precio;
    }

    public double Subtotal(){
        return precio*cantidad;
    }
}

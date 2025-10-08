package practica4;

public class Viento extends Instrumento {
    private String material;

    public Viento(String nombre, String marca, String material, double precio){
        super(nombre, marca, precio);
        this.material=material;
    }

    public String getMaterial(String material){
        return material;
    }

    @Override
    public String Tocar(){
        return "Soplando " + nombre + " de " + material;
    }

    @Override
    public String MostrarInfo(){
        return super.MostrarInfo() + " Material: " + material;
    }

}

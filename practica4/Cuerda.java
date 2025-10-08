package practica4;

public class Cuerda extends Instrumento {

    private int numeroCuerdas;

    public Cuerda(String nombre, String marca, double precio, int numeroCuerdas){
        super(nombre, marca, precio);
        this.numeroCuerdas=numeroCuerdas;
    }
    
    @Override
    public String Tocar(){
        return "Tocando las " + numeroCuerdas + " cuerdas de " + nombre;
    }
    
    @Override
    public String MostrarInfo(){
        return super.MostrarInfo() + " Numero de cuerdas: " + numeroCuerdas;
    }
     
    public int getNumeroCuerdas(int numeroCuerdas){
        return numeroCuerdas;
    }

}

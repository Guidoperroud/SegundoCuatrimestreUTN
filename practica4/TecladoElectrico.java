package practica4;

public class TecladoElectrico extends Instrumento implements Electrico {
    private int numeroTeclas;
    private boolean encendido;
    
    public TecladoElectrico(int numeroTeclas, boolean encendido, String nombre, String marca, double precio){
        super(nombre, marca, precio);
        this.numeroTeclas=numeroTeclas;
        this.encendido=encendido;
    }
    @Override
    public void encender() {
        encendido=true;
        System.out.println("Teclado encendido");
    } 
    @Override
    public boolean estaEncendido() { 
        return encendido;
    }
    @Override
    public void Tocar(){
        if (encendido) {
            System.out.println("El teclado esta sonando.");
        }
        else{
            System.out.println("El teclcado esta apagado.");
        }
    }
    @Override
    public String MostrarInfo(){
        return super.MostrarInfo() + "Numero de teclas: " + numeroTeclas + "Esta encendido: " + encendido;
    }
    @Override
    public void apagar(){
        encendido=false;
        System.out.println("El teclado fue apagado correctamente.");
    }
}

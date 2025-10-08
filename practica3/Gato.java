package practica3;

public class Gato extends Animales{

    private String color;

    public Gato(String nombre, int edad, String color){
        super(nombre, edad, "gato");
        this.color=color;
    }
    public Gato(String nombre) {
        super(nombre, "Gato");
        this.color = "Desconocido";
    }

    public String getolor(String color){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String EmitirSonido(){
        return "Miau miau";
    }

    public String Ronroneo(){
        return "El gato " + nombre + " esta ronroneando";
    }
    @Override
    public String toString(){
        return super.toString()+", Color:"+color;
    }
}

package practica3;

public class Animales {
    protected String nombre;
    protected int edad;
    protected String especie;

    public Animales (String nombre, int edad, String especie){
       this.nombre= nombre;
       this.edad=edad;
       this.especie=especie;
    }

    public Animales (String nombre, String especie){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=0;
    }
     
    public void setNombre(String nombre){ 
        if (nombre==null || nombre.trim().isEmpty()) {
            System.out.print("El nombre no puede estar vacio.");
        } 
        this.nombre=nombre;
    }

    public String getNombre(String nombre){
        return this.nombre;
    }

    public void setEdad(int edad){
        if (edad<0) {
            System.out.print("La edad no puede ser menor a cero.");
        }
        this.edad=edad;
    }

    public int getNombre(int edad){
        return this.edad;
    }    
   
    public void setEspecie(String especie){
        this.especie=especie;
    } 

    public String getEspecie(String especie){
        return this.especie;
    } 
    
    public String EmitirSonido(){
        return "Sonido de animal";
    }

    @Override
    public String toString(){
        return "Animal{Nombre: '" + nombre + "'Edad: '" + edad + "'Especie: '"+ especie + "}";
    }  

}

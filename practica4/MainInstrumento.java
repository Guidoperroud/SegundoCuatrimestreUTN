package practica4;

import java.util.ArrayList;

public class MainInstrumento {
    public static void main(String[] args) {
     Cuerda guitarra = new Cuerda("Guitarra", "Yamaha", 1500, 6);
      Cuerda violin = new Cuerda("Violin", "Stradivarius", 3000, 4);
      
      Viento flauta = new Viento("Flauta", "Yamaha", "Metal", 800);
      Viento saxo = new Viento("Saxo", "Selmer", "Laton", 2500);

  /*   Instrumento[] orquesta = {guitarra, violin, flauta, saxo};

        System.out.println("== MOSTRAR INFORMACIÓN ==");
        for (Instrumento inst : orquesta) {
            inst.MostrarInfo();
            System.out.println();
        }

        System.out.println("== TOCAR INSTRUMENTOS ==");
        for (Instrumento inst : orquesta) {
            inst.Tocar();
        }

        System.out.println("\n== AFINAR INSTRUMENTOS ==");
        for (Instrumento inst : orquesta) {
            inst.Afinando();
        }
*/
        ArrayList<Instrumento> orquesta = new ArrayList<>();
    
        orquesta.add(new GuitarraElectrica(null, false, "Guitarra", "Marca", 8000, 6));  
        orquesta.add(guitarra);
        orquesta.add(saxo);
        orquesta.add(violin);
        orquesta.add(new TecladoElectrico(61, false, "teclado", "MArca", 10000));
         
        for (Instrumento inst : orquesta) {
            inst.MostrarInfo();
            inst.Tocar();
        }
        if (Afinable inst instanceof Afinable) {
            Afinable afinable = (Afinable) inst;
            afinable.afinarAutomaticamente();
        }

        if (Electrico inst instanceof Electrico) {
                Electrico electrico = (Electrico) inst;
                electrico.encender(); 
            }
    }
}

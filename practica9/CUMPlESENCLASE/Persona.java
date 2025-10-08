import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechanacimiento;

    public Persona(){};

    public Persona(String nombre, String apellido, LocalDate fechanacimiento){
        this.apellido=apellido;
        this.fechanacimiento=fechanacimiento;
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public LocalDate getFechanacimiento(){
        return this.fechanacimiento;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setFechanacimiento(LocalDate fechanacimiento){
        this.fechanacimiento=fechanacimiento;
    }

    public boolean yacumplio(){
        LocalDate hoy = LocalDate.now();
        LocalDate fechacumple = LocalDate.of(hoy.getYear(), this.fechanacimiento.getMonthValue(), this.fechanacimiento.getDayOfMonth());
        return hoy.isAfter(fechacumple);
    }

    public boolean cumplehoy(){
        LocalDate hoy = LocalDate.now();
        LocalDate fechacumple = LocalDate.of(hoy.getYear(), this.fechanacimiento.getMonthValue(), this.fechanacimiento.getDayOfMonth());
        boolean resultado = fechacumple.equals(hoy);
        return resultado;
    }

    public int calcularEdad(){
        LocalDate hoy = LocalDate.now();

        if (yacumplio() || this.cumplehoy()) {
            return hoy.getYear() - fechanacimiento.getYear();
        }
        else{
            return hoy.getYear() - fechanacimiento.getYear() - 1;
        }
    }

    public String retornarpersonaconedad(){
        StringBuilder sb = new StringBuilder();

        sb.append("NOMbre: ");
        sb.append(this.getNombre());
        sb.append( "  ");
        Sb.append(this.getApellido());
        sb.append("\n");
        sb.append("\nEdad: ");
        sb.append(this.calcularEdad());

        if (this.cumplehoy()) {
            sb.append("\n Feliz cumple cra");
            sb.append(this.fechanacimiento.getDayOfMonth());
            sb.append("/");
            sb.append(this.fechanacimiento.getMonthValue());   
        } else if (this.yacumplio()){
            sb.append("\n Ya cumplio este año el dia: ");
            sb.append(this.fechanacimiento.getDayOfMonth());
            sb.append("/");
            sb.append(this.fechanacimiento.getMonthValue());               
        } else {
            sb.append("\n Cumple este año el dia: ");
            sb.append(this.fechanacimiento.getDayOfMonth());
            sb.append("/");
            sb.append(this.fechanacimiento.getMonthValue());             
        }
        return sb.toString();
    }

    public String toStringCSV(){
        StringBuilder sb = new StringBuilder();

        sb.append(this.getNombre());
        sb.append(",");
        sb.append(this.getApellido);
        sb.append(",");
        sb.append(this.getFechanacimiento());

        return sb.toString();
    }
}

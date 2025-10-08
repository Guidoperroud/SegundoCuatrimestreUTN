package practica2;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private boolean activo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo, boolean activo){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.activo=activo;
    }

    public CuentaBancaria(String titular, String numeroCuenta){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
    }

    public CuentaBancaria(String titular){
        this.titular=titular;
    }

    public void setTitular(String titular){
        if (titular==null || titular.trim().isEmpty()) {
            System.out.println("Debe indicar quien es el titular.");
        }
        this.titular=titular;
    }

    public String getTitular(String titular){
        return this.titular;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    public String getNumeroCuenta(String numeroCuenta){
        return this.numeroCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo(double saldo){
        return this.saldo;
    }

    public void setActivo(boolean activo){
       this.activo=activo; 
    }

    public boolean getActivo(boolean activo){
        return this.activo;
    }

    public void Depositar(double monto){
        if (!activo) {
           System.out.print("No se puede depositar!! Cuenta inactiva.");
        return;
        }
        if (saldo<= 0) {
            System.out.print("El saldo debe ser positivo.");
            return;
        }
        saldo+=monto;
    }

    public void Extraer(double monto){
        if (!activo) {
            System.out.print("No se puede extraer!! Cuenta inactiva.");
            return;
        }
        if (monto>saldo) {
            System.out.print("Fondos insuficientes.");
            return;
        }
        if (0>=monto) {
            System.out.print("El monto debe ser positivo.");
        }
        saldo-=monto;
    }

    public void ActivarCuenta( boolean activo){
        this.activo=true;
    }

    public void DesactivarCuenta(boolean activo, double saldo){
        if (saldo==0) {
            this.activo=false;
        }
    }

    public boolean EsCuentaVIP(){
            return saldo>10000;
    }

    public String GetEstadoCuenta(){
        return "Titular: " + titular + " Numero de Cuenta: " + numeroCuenta + " Saldo: " + saldo + " Cuenta Activa: " + (activo ? "si" : "no") + " Es VIP? " + (EsCuentaVIP() ? "si" : "no");
    }
    @Override

    public String toString(){
        return "Cuenta{Titular:'"+ titular + "', Numero de cuenta:'" + numeroCuenta + "', Saldo: '"+ saldo +"'Activo: '"+ activo +"}";
    }
}

package practica2;

public class MainCueBanc {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Guido Perroud", "123456", 5000, true);
        CuentaBancaria cuenta2 = new CuentaBancaria("Agustin", "1234");
        CuentaBancaria cuenta3 = new CuentaBancaria("Mirian");

        cuenta1.Depositar(8000);
        cuenta2.ActivarCuenta(true);
        cuenta2.Depositar(2000);
        cuenta3.ActivarCuenta(true);
        cuenta3.Depositar(2000);
        cuenta1.Extraer(2000);
        cuenta2.Extraer(2000);
        cuenta2.DesactivarCuenta(false, 0);

        System.out.println("--Estado final de las cuentas--");
        System.out.println(cuenta1.GetEstadoCuenta());
        System.out.println(cuenta2.GetEstadoCuenta());
        System.out.println(cuenta3.GetEstadoCuenta());   
        
        System.out.println("Es cuenta VIP?");
        System.out.println("Cuenta 1: " + (cuenta1.EsCuentaVIP() ? "Si" : "no") );
        System.out.println("Cuenta 2: " + (cuenta2.EsCuentaVIP() ? "Si" : "no") );
        System.out.println("Cuenta 3: " + (cuenta3.EsCuentaVIP() ? "Si" : "no") );
    }
}

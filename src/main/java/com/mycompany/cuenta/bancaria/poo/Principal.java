public class Principal {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Isaac Rivera", "507232755", 1000.0);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo Inicial: " + cuenta.getSaldo());

        cuenta.ingresar(500.0);
        System.out.println("Saldo después de ingresar $500: " + cuenta.getSaldo());

        cuenta.retirar(200.0);
        System.out.println("Saldo después de retirar $200: " + cuenta.getSaldo());

        double saldoConInteres = cuenta.calcularInteres();
        System.out.println("Saldo con interés aplicado (1.5%): " + saldoConInteres);

        cuenta.setTipoInteres(3.0); 
        saldoConInteres = cuenta.calcularInteres();
        System.out.println("Saldo con interés aplicado (3%): " + saldoConInteres);

        cuenta.setTitular("Milena Lopez");
        System.out.println("Nuevo titular: " + cuenta.getTitular());
    }
}
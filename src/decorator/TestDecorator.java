package decorator;

/**
 *
 * @author fernando prudencio
 */
public class TestDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Prudencio");

        CuentaBancaria cuentaAhorro = new CuentaAhorro();
        CuentaBancaria cuentaBlindada = new BlindajeDecorator(cuentaAhorro);

        cuentaBlindada.openAccount(c);
    }

}

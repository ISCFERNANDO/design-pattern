package decorator;

/**
 *
 * @author fernando prudencio
 */
public class BlindajeDecorator extends CuentaDecorator {

    public BlindajeDecorator(CuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void openAccount(Cuenta c) {
        cuentaDecorada.openAccount(c);
        addShield(c);
    }

    public void addShield(Cuenta c) {
        System.out.println("Se agrego blindaje a la cuenta => " + c.toString());
    }

}

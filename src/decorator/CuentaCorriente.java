package decorator;

/**
 *
 * @author fernando prudencio
 */
public class CuentaCorriente implements CuentaBancaria {

    @Override
    public void openAccount(Cuenta c) {
        System.out.println("-------------------------");
        System.out.println("Abriendo cuenta de corriente");
        System.out.println("Cliente => " + c.toString());
        System.out.println("La cuenta se abrió de manera exitosa");
    }

}

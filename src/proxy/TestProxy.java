package proxy;

/**
 *
 * @author fernando prudencio
 */
public class TestProxy {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Prudencio");

        CuentaBancaria cuentaProxy = new CuentaProxy();
        c = cuentaProxy.depositarDinero(c, 100);
        c = cuentaProxy.retirarDinero(c, 40);
        cuentaProxy.mostrarSaldo(c);
    }

}

package proxy;

/**
 *
 * @author fernando prudencio
 */
public class CuentaProxy implements CuentaBancaria {

    private CuentaBancoImpl cuentaBanco;

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        if (cuentaBanco == null) {
            cuentaBanco = new CuentaBancoImpl();
        }
        return cuentaBanco.retirarDinero(cuenta, monto);
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        if (cuentaBanco == null) {
            cuentaBanco = new CuentaBancoImpl();
        }
        return cuentaBanco.depositarDinero(cuenta, monto);
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        if (cuentaBanco == null) {
            cuentaBanco = new CuentaBancoImpl();
        }
        cuentaBanco.mostrarSaldo(cuenta);
    }

}

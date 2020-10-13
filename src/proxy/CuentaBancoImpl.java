package proxy;

/**
 *
 * @author fernando prudencio
 */
public class CuentaBancoImpl implements CuentaBancaria {

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        double nuevoSaldo = cuenta.getSaldo() - monto;
        cuenta.setSaldo(nuevoSaldo);
        System.out.println("Saldo ==> " + nuevoSaldo);
        return cuenta;
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        double nuevoSaldo = cuenta.getSaldo() + monto;
        cuenta.setSaldo(nuevoSaldo);
        System.out.println("Saldo ==> " + nuevoSaldo);
        return cuenta;
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        double nuevoSaldo = cuenta.getSaldo();
        cuenta.setSaldo(nuevoSaldo);
        System.out.println("Saldo ==> " + nuevoSaldo);
    }

}

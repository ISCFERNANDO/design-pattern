package proxy;

/**
 *
 * @author fernando prudencio
 */
public interface CuentaBancaria {

    public Cuenta retirarDinero(Cuenta cuenta, double monto);

    public Cuenta depositarDinero(Cuenta cuenta, double monto);

    public void mostrarSaldo(Cuenta cuenta);
}

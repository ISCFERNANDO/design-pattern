package decorator;

/**
 *
 * @author fernando prudencio
 */
public abstract class CuentaDecorator implements CuentaBancaria {
    
    protected CuentaBancaria cuentaDecorada;
    
    public CuentaDecorator(CuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }
    
    @Override
    public void openAccount(Cuenta c) {
        cuentaDecorada.openAccount(c);
    }
    
}

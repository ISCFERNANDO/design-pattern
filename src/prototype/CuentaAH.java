package prototype;

/**
 *
 * @author fernando prudencio
 */
public class CuentaAH implements Cuenta {

    private String tipo;
    private double monto;

    public CuentaAH() {
        tipo = "AHORRO";
    }

    @Override
    public Cuenta clonar() {
        CuentaAH cuenta = null;
        try {
            cuenta = (CuentaAH) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "Cuenta AH [tipo=" + tipo + ", monto=" + monto + "]";
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

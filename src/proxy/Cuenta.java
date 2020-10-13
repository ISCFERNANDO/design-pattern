package proxy;

/**
 *
 * @author fernando prudencio
 */
public class Cuenta {

    private int id;
    private String cliente;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{ id: ".concat(id + ", ").concat("cliente").concat(cliente).concat(", saldo").concat(saldo + "").concat(" }");
    }

}

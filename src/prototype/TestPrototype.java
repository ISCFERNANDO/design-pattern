package prototype;

/**
 *
 * @author fernando prudencio
 */
public class TestPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuentaAH = new CuentaAH();
        System.out.println(cuentaAH.toString());

        CuentaAH cuentaAH2 = (CuentaAH) cuentaAH.clonar();
        cuentaAH2.setMonto(100);
        System.out.println(cuentaAH2.toString());

        System.out.println(cuentaAH == cuentaAH2);
    }

}

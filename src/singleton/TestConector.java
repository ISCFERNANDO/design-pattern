package singleton;

/**
 *
 * @author fernando prudencio
 */
public class TestConector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conector conn = Conector.getInstance();
        conn.connect();
        conn.disconnect();
    }

}

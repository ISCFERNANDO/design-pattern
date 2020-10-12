package singleton;

/**
 *
 * @author fernando prudencio
 */
public class Conector {

    private static Conector instance;

    private Conector() {
    }

    public static Conector getInstance() {
        if (instance == null) {
            instance = new Conector();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conecting to BD...");
    }

    public void disconnect() {
        System.out.println("Disconecting to BD...");
    }
}

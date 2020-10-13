package abstract_factory.bd_provider;

/**
 *
 * @author fernando prudencio
 */
public class PostgreSqlConnection extends BDConnection {

    private static PostgreSqlConnection instance;

    private PostgreSqlConnection() {
    }

    public static PostgreSqlConnection getInstance() {
        if (instance == null) {
            instance = new PostgreSqlConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Conecting to PostreSQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconecting from PostreSQL...");
    }
}

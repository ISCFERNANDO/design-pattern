package abstract_factory.bd_provider;

/**
 *
 * @author fernando prudencio
 */
public class SQLServerConnection extends BDConnection {

    private static SQLServerConnection instance;

    private SQLServerConnection() {
    }

    public static SQLServerConnection getInstance() {
        if (instance == null) {
            instance = new SQLServerConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Conecting to SQL Server...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconecting from SQL Server...");
    }
}

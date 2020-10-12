package factory;

/**
 *
 * @author fernando prudencio
 */
public class MysqlConnection implements BDConnection {

    private String host;
    private String port;
    private String userName;
    private String password;

    private static MysqlConnection instance;

    private MysqlConnection() {
    }

    public static MysqlConnection getInstance() {
        if (instance == null) {
            instance = new MysqlConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Conecting to Mysql...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconecting from Mysql...");
    }

}

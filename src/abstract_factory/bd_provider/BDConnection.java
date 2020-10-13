package abstract_factory.bd_provider;

/**
 *
 * @author fernando prudencio
 */
public abstract class BDConnection {

    private String host;
    private String port;
    private String userName;
    private String password;

    public abstract void connect();

    public abstract void disconnect();
}

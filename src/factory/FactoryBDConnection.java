package factory;

/**
 *
 * @author fernando prudencio
 */
public class FactoryBDConnection implements FactoryBD {

    @Override
    public BDConnection createConnection(TypeConnection typeConnection) {
        assert (typeConnection != null);
        switch (typeConnection) {
            case MYSQL:
                return MysqlConnection.getInstance();
            case SQLSERVER:
                return SQLServerConnection.getInstance();
            case POSTGRESQL:
                return PostgreSqlConnection.getInstance();
            default:
                break;
        }
        return null;
    }
}

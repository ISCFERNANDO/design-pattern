package abstract_factory;

import abstract_factory.bd_provider.BDConnection;
import abstract_factory.bd_provider.MysqlConnection;
import abstract_factory.bd_provider.PostgreSqlConnection;
import abstract_factory.bd_provider.SQLServerConnection;
import abstract_factory.bd_provider.TypeBDConnection;
import abstract_factory.rest_provider.RESTConnection;
import abstract_factory.rest_provider.TypeRestConnection;

/**
 *
 * @author fernando prudencio
 */
public class FactoryDBConnection extends AbstractFactory {

    @Override
    public BDConnection createDBConnection(TypeBDConnection typeConnection) {
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

    @Override
    public RESTConnection createRESTConnection(TypeRestConnection typeConnection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

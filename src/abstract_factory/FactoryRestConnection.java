package abstract_factory;

import abstract_factory.bd_provider.BDConnection;
import abstract_factory.bd_provider.TypeBDConnection;
import abstract_factory.rest_provider.RESTConnection;
import abstract_factory.rest_provider.RestConnectionSales;
import abstract_factory.rest_provider.RestConnectionShopping;
import abstract_factory.rest_provider.TypeRestConnection;

/**
 *
 * @author fernando prudencio
 */
public class FactoryRestConnection extends AbstractFactory {

    @Override
    public BDConnection createDBConnection(TypeBDConnection typeConnection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RESTConnection createRESTConnection(TypeRestConnection typeConnection) {
        assert (typeConnection != null);
        switch (typeConnection) {
            case SALES:
                return new RestConnectionSales();
            case SHOPPING:
                return new RestConnectionShopping();
            default:
                break;
        }
        return null;
    }

}

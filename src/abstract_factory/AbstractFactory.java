package abstract_factory;

import abstract_factory.bd_provider.BDConnection;
import abstract_factory.bd_provider.TypeBDConnection;
import abstract_factory.rest_provider.RESTConnection;
import abstract_factory.rest_provider.TypeRestConnection;

/**
 *
 * @author fernando prudencio
 */
public abstract class AbstractFactory {

    public abstract BDConnection createDBConnection(TypeBDConnection typeConnection);

    public abstract RESTConnection createRESTConnection(TypeRestConnection typeConnection);
}

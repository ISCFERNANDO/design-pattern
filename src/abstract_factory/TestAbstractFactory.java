package abstract_factory;

import abstract_factory.bd_provider.BDConnection;
import abstract_factory.bd_provider.TypeBDConnection;
import abstract_factory.rest_provider.RESTConnection;
import abstract_factory.rest_provider.TypeRestConnection;

/**
 *
 * @author fernando
 */
public class TestAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory fabricBD = FactoryConnection.createConnection(TypeConcretFabric.DB);
        BDConnection dbConn = fabricBD.createDBConnection(TypeBDConnection.POSTGRESQL);
        dbConn.connect();
        dbConn.disconnect();

        dbConn = fabricBD.createDBConnection(TypeBDConnection.MYSQL);
        dbConn.connect();
        dbConn.disconnect();

        AbstractFactory fabricREST = FactoryConnection.createConnection(TypeConcretFabric.REST);
        RESTConnection restCob = fabricREST.createRESTConnection(TypeRestConnection.SHOPPING);
        restCob.leerURL("");

        restCob = fabricREST.createRESTConnection(TypeRestConnection.SALES);
        restCob.leerURL("");

    }

}

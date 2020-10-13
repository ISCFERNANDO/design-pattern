package abstract_factory;

/**
 *
 * @author fernando
 */
public class FactoryConnection {

    public static AbstractFactory createConnection(TypeConcretFabric typeConcret) {
        if (typeConcret == TypeConcretFabric.DB) {
            return new FactoryDBConnection();
        } else if (typeConcret == TypeConcretFabric.REST) {
            return new FactoryRestConnection();
        }
        return null;
    }

}

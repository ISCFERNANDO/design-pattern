package factory;

/**
 *
 * @author fernando prudencio
 */
public interface FactoryBD {

    public BDConnection createConnection(TypeConnection typeConnection);
}

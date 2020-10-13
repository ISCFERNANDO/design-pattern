package abstract_factory.rest_provider;

/**
 *
 * @author fernando prudencio
 */
public class RestConnectionShopping implements RESTConnection {

    @Override
    public void leerURL(String url) {
        System.out.println("Connection to shopping");
    }

}

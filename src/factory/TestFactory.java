package factory;

/**
 *
 * @author fernando prudencio
 */
public class TestFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BDConnection connection;
        FactoryBD fabricConnection = new FactoryBDConnection();
        //conection to postresql
        System.out.println("Connection to postresql");
        connection = fabricConnection.createConnection(TypeConnection.POSTGRESQL);
        connection.connect();
        connection.disconnect();
        System.out.println("");

        //conection to mysql
        System.out.println("Connection to mysql");
        connection = fabricConnection.createConnection(TypeConnection.MYSQL);
        connection.connect();
        connection.disconnect();
        System.out.println("");

        //conection to sql sever
        System.out.println("Connection to sql server");
        connection = fabricConnection.createConnection(TypeConnection.SQLSERVER);
        connection.connect();
        connection.disconnect();

    }

}

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
        FabricBDConnection fabricConnection = new FabricBDConnection();
        //conection to postresql
        System.out.println("Connection to postresql");
        connection = fabricConnection.getConnection(TypeConnection.POSTGRESQL);
        connection.connect();
        connection.disconnect();
        System.out.println("");

        //conection to mysql
        System.out.println("Connection to mysql");
        connection = fabricConnection.getConnection(TypeConnection.MYSQL);
        connection.connect();
        connection.disconnect();
        System.out.println("");

        //conection to sql sever
        System.out.println("Connection to sql server");
        connection = fabricConnection.getConnection(TypeConnection.SQLSERVER);
        connection.connect();
        connection.disconnect();

    }

}

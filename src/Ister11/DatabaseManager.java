package Ister11;

public class DatabaseManager {

    private static int index = 0;

    public static String getDatabaseType(){
        String[] supportedDatabaseTypes = {"MongoDB", "MySql"};
        return supportedDatabaseTypes[index++];
    }

    public static void main(String[] args) {
        System.out.println("> Changing the database to MongoDB and running client code.");
        clientCode();
        System.out.println("> Changing the database to MySql and running the client code again");
        clientCode();
    }

    public static void clientCode(){
        String currentDatabaseType = getDatabaseType();
        AbstractStatementBuilderFactory abstractStatementBuilderFactory;

        if (currentDatabaseType.equals("MongoDB")){
            abstractStatementBuilderFactory = new MongoDbStatementBuilderFactory();
        }else if(currentDatabaseType.equals("MySql")){
            abstractStatementBuilderFactory = new MySqlStatementBuilderFactory();
        }else{
            System.out.println("Unsupported Database type");
            return;
        }
        StatementBuilder statementBuilder = abstractStatementBuilderFactory.createStatementBuilder();
        PreparedStatementBuilder preparedStatementBuilder = abstractStatementBuilderFactory.createPreparedStatementBuilder();

        System.out.println(statementBuilder.createStatement());
        System.out.println(preparedStatementBuilder.insert(1));
        System.out.println(preparedStatementBuilder.find(1));
        System.out.println(preparedStatementBuilder.update(1));
        System.out.println(preparedStatementBuilder.delete(1));
    }
}

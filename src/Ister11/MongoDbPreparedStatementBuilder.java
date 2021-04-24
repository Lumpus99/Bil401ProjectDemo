package Ister11;

public class MongoDbPreparedStatementBuilder extends PreparedStatementBuilder{
    @Override
    public String find(int index) {
        return "MongoDB find Query";
    }

    @Override
    public String delete(int index) {
        return "MongoDB delete Query";
    }

    @Override
    public String update(int index) {
        return "MongoDB update Query";
    }

    @Override
    public String insert(int index) {
        return "MongoDB insert Query";
    }
}

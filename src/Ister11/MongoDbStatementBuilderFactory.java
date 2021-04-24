package Ister11;

public class MongoDbStatementBuilderFactory extends AbstractStatementBuilderFactory{
    @Override
    public StatementBuilder createStatementBuilder() {
        return new MongoDbStatementBuilder();
    }

    @Override
    public PreparedStatementBuilder createPreparedStatementBuilder() {
        return new MongoDbPreparedStatementBuilder();
    }
}

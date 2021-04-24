package Ister11;

public class MySqlStatementBuilderFactory extends AbstractStatementBuilderFactory{
    @Override
    public StatementBuilder createStatementBuilder() {
        return new MySqlStatementBuilder();
    }

    @Override
    public PreparedStatementBuilder createPreparedStatementBuilder() {
        return new MySqlPreparedStatementBuilder();
    }
}

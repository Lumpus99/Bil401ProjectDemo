package Ister11;

public class MySqlPreparedStatementBuilder extends PreparedStatementBuilder{
    @Override
    public String find(int index) {
        return "MySql find Query";
    }

    @Override
    public String delete(int index) {
        return "MySql delete Query";
    }

    @Override
    public String update(int index) {
        return "MySql update Query";
    }

    @Override
    public String insert(int index) {
        return "MySql insert Query";
    }
}

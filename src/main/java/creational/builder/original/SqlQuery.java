package creational.builder.original;

/**
 * Created by David Marin on 21/06/2015.
 */
public class SqlQuery implements Query {

    private String from;
    private String where;

    @Override
    public void execute() {
        System.out.println("Execute Sql query. From: " + from + " Where: " + where);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}

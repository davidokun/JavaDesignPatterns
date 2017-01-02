package creational.builder;

/**
 * Created by David Marin on 21/06/2015.
 */
public class MongoDbQuery implements Query {

    private String from;
    private String where;

    @Override
    public void execute() {
        System.out.println("Execute Mongo DB query. From: " + from + " Where: " + where);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}

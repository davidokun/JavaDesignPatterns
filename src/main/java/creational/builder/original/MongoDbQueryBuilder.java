package creational.builder.original;

/**
 * Created by David Marin on 21/06/2015.
 */
public class MongoDbQueryBuilder implements QueryBuilder {

    private MongoDbQuery query = new MongoDbQuery();

    public void from(String from) {
        query.setFrom(from);
    }

    public void where(String where) {
        query.setWhere(where);
    }

    public Query getQuery() {
        return query;
    }
}

package creational.builder.original;

/**
 * Created by David Marin on 21/06/2015.
 */
public class ClientBuilder {

    public static void main(String[] args) {

        final QueryBuilderDirector director = new QueryBuilderDirector();
        String from = "client table";
        String where = "cliente name = :name";

        QueryBuilder queryBuilder = new SqlQueryBuilder();
        Query query = director.buildQuery(from, where, queryBuilder);
        query.execute();

        queryBuilder = new MongoDbQueryBuilder();
        query = director.buildQuery(from, where, queryBuilder);
        query.execute();

    }
}

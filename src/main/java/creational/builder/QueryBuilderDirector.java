package creational.builder;

/**
 * Created by David Marin on 21/06/2015.
 */
public class QueryBuilderDirector {

    /**
     *
     * @param from
     * @param where
     * @param builder
     * @return
     */
    public Query buildQuery(String from, String where, QueryBuilder builder){
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}

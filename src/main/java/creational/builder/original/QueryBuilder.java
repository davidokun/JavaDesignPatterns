package creational.builder.original;

/**
 * Created by David Marin on 21/06/2015.
 */
public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();
}

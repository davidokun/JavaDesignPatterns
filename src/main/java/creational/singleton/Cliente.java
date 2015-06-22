package creational.singleton;

/**
 * Created by David Marin on 21/06/2015.
 */
public class Cliente {

    public static void main(String[] args) {

        final Singleton singleton =  Singleton.getInstance();

        singleton.sayHello();
    }
}

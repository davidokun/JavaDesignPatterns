package creational.singleton;

/**
 * Created by David Marin on 21/06/2015.
 */
public class Singleton {

    /**
     * A single instance of the object
     */
    private static Singleton instance = null;

    /**
     * It cannot be create externally
     */
    private Singleton(){}

    /**
     * It create a single instance of the Class. It must be synchronized
     * for multithreaded environments
     */
    private synchronized static void createInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
    }

    /**
     * Get the single instance created or create one if none exists
     *
     * @return the single instance created
     */
    public static Singleton getInstance(){
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    /**
     * Just a method to test the singleton pattern
     */
    public void sayHello(){
        System.out.println("Hello Singleton");
    }

}

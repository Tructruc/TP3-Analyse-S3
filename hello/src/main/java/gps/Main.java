package gps;

/**
 * La classe Main.
 */
public class Main {
    /**
     * Le programme principal de l’application.
     */
    public static void main(String[] args) {
        System.out.println(hello());
    }

    /**
     * La méthode hello.
     *
     * @return le message de bienvenue
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     * La méthode hello.
     *
     * @param echo le message à afficher
     *
     * @return le message de bienvenue
     */
    public static String hello(String echo) {
        return echo;
    }
}
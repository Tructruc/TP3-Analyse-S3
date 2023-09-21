package gps;
import junit.framework.Test;
import junit.framework.TestCase;


/**
 * Classe de test de la classe Main.
 */
public class Maintest extends TestCase {

    /**
     * Crée le test case.
     *
     * @param testName le nom du test case
     */
    public Maintest( String testName ) {
        super( testName );
    }

    /**
     * Le test à exécuter.
     *
     * @return the test
     */
    public static Test suite() {
        return new Maintest( "testHello" );
    }

    /**
     * Test de la méthode hello.
     */
    public void testHello() {
        assertEquals("Hello World!", Main.hello());
    }
}

package gps;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


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
     * Donne les tests à exécuter.
     *
     * @return les tests à exécuter
     */
    public static Test suite() {
        return new TestSuite( Maintest.class );
    }

    /**
     * Test de la méthode hello.
     */
    public void testHello() {
        assertEquals("Hello World!", Main.hello());
    }

    public void testHelloEcho() {
        assertEquals("Test1234", Main.hello("Test1234"));
    }
}

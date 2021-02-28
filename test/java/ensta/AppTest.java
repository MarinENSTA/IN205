package ensta;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSimple()
    {
        assertTrue( true);
    }

    public void test_hasShip()
    {
        Board testBoard = new Board("Test");
        Destroyer testDestroyer = new Destroyer();
        testBoard.putShip(testDestroyer, 5, 5);
        boolean test =  testBoard.hasShip(6,5);
        assertTrue(test);
    }

    public void test_setOrientation()
    {
        Destroyer testDestroyer = new Destroyer(AbstractShip.Orientation.EAST);
        testDestroyer.setOrientation(AbstractShip.Orientation.NORTH);
        assertTrue(testDestroyer.getOrientation() == AbstractShip.Orientation.NORTH);
    }

    public void test_setHit()
    {
        Board testBoard = new Board("Test");
        testBoard.setHit(true, 1,1);
        assertTrue(testBoard.getHit(1,1) == true);
    }

        public void test_setHit_Out_Of_Bounds()
    {
        Board testBoard = new Board("Test");
        assertTrue(testBoard.getHit(100,100) == false);
    }

    public void test_BoardConstruct1()
    {
        Board testBoard = new Board("Test");
        assertTrue(testBoard.navires[0][1].isStruck() == null);
    }

    public void test_BoardConstruct2()
    {
        Board testBoard = new Board("Test");
        Destroyer testDestroyer = new Destroyer();
        testBoard.putShip(testDestroyer, 5, 5);
        assertTrue( testBoard.navires[5][5].isStruck() == false);
    }

    public void test_Hit()
    {
        Hit testHit = Hit.fromInt(4);
        assertTrue( testHit.toString() == "Croiseur");
    }

    public void test_isPut()
    {
        Board testBoard = new Board(26,"Test");
        Destroyer testDestroyer = new Destroyer();
        testBoard.putShip(testDestroyer, 1, 17);
        assertTrue(testDestroyer.put);
    }

    public void test_BoardConstruct3()
    {
        Board testBoard = new Board(100,"Test");
        assertTrue(testBoard.getSize() == 26);
        //TRONCATURE DU BOARD AU DELA DE 26
    }


}

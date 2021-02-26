package ensta;


public class TestBoard 
{
    public static void main( String[] args )
    {
    	// Les lignes commentées servent pour les exercices suivants (commits suivants)

    	//Test exercice 1
        /*
        Board testBoard = new Board(5, "Test");
        testBoard.print();
        */
		


        //Test exercice 2
        /*
        Destroyer testDestroyer = new Destroyer('E');
        System.out.println(testDestroyer.orientation);
        testDestroyer.setOrientation('N');
        System.out.println(testDestroyer.orientation);
        */
		

        //Test exercice 3
        /*
        Tests volontairement hors limites pour voir la robustesse du code
        testBoard.putShip(testDestroyer, 10, 10);
        System.out.println(testBoard.hasShip(0,10));
		

        testBoard.putShip(testDestroyer, 0, 4);
        testBoard.print();
        testDestroyer.setOrientation('W');
        testBoard.putShip(testDestroyer, 1, 4);
        testBoard.print();

        Carrier testCarrier = new Carrier('E');
        testBoard.putShip(testCarrier, 7,7);
		/*

        //Test exercice 4
		/*
        Board testEnnemyBoard = new Board(10, "Test");
        Player testPlayer = new Player(testBoard,testEnnemyBoard, ships);
		*/

        //Test exercice 5
        /*
        Board testBoard = new Board(10, "Test");
        Destroyer testDestroyer = new Destroyer('E');
        testBoard.putShip(testDestroyer, 0, 4);
        testBoard.print();
        testBoard.setHit(true, 1,1);
        testBoard.navires[4][0].struck = true;
        testBoard.print();
        //Cela fonctionne !
        */

        //Test exercice 6
        Hit testHit;
        Board testBoard = new Board(10, "Test");
        Destroyer testDestroyer = new Destroyer(AbstractShip.Orientation.EAST);
        testBoard.putShip(testDestroyer, 0, 4);
        testHit = testBoard.sendHit(0,4);
       	System.out.println(testHit.toString());
        testBoard.print();
        testHit = testBoard.sendHit(1,4); // doit retourner la valeur TYPE_DU_NAVIRE
        testBoard.print();

        System.out.println("Navire coulé  ? ==> " + testDestroyer.isSunk());
        System.out.println("Dernière valeur renvoyée ? ==> " + testHit.toString());
        //Cela fonctionne bien

        



    }
}
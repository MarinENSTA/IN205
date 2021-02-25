package ensta;


public class TestBoard 
{
    public static void main( String[] args )
    {
    	// Les lignes commentées servent pour les exercices suivants (commits suivants)

    	//Test exercice 1
        Board testBoard = new Board(10, "Test");
        //testBoard.print();
		


        //Test exercice 2
        Destroyer testDestroyer = new Destroyer('E');
        //System.out.println(testDestroyer.orientation);
        //testDestroyer.setOrientation('N');
        //System.out.println(testDestroyer.orientation);
		

        //Test exercice 3
        //Tests volontairement hors limites pour voir la robustesse du code
        //testBoard.putShip(testDestroyer, 10, 10);
        //System.out.println(testBoard.hasShip(0,10));

        //testBoard.putShip(testDestroyer, 0, 4);
        //testBoard.print();
        //testDestroyer.setOrientation('W');
        //testBoard.putShip(testDestroyer, 1, 4);
        //testBoard.print();

        //Carrier testCarrier = new Carrier('E');
        //testBoard.putShip(testCarrier, 7,7);

        //Test exercice 4
        //Submarine testSub1 = new Submarine();
        //Submarine testSub2 = new Submarine();
        //Battleship testBatt = new Battleship();
        //Carrier testCarrier = new Carrier();

        //Board testEnnemyBoard = new Board(10, "Test");
        //Player testPlayer = new Player(testBoard,testEnnemyBoard, ships);





    }
}
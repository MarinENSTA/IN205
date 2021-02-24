package ensta;


public class TestBoard 
{
    public static void main( String[] args )
    {
    	// Les lignes commentées servent pour les exercices suivants (commits suivants)

    	//Test exercice 1
        Board test = new Board(10, "Test");
        test.print();

        //Test exercice 2
        Destroyer desttest = new Destroyer('E');
        System.out.println(desttest.orientation);
        desttest.setOrientation('N');
        System.out.println(desttest.orientation);


        //test.putShip(desttest, 10, 10);

        //System.out.println(test.hasShip(0,10));
    }
}
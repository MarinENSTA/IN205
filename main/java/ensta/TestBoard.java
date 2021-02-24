package ensta;


public class TestBoard 
{
    public static void main( String[] args )
    {
    	// Les lignes commentées servent pour les exercices suivants (commits suivants)
        Board test = new Board(10, "Test");
        //Carrier desttest = new Carrier('E');
        //test.putShip(desttest, 10, 10);
        test.print();
        //System.out.println(test.hasShip(0,10));
    }
}
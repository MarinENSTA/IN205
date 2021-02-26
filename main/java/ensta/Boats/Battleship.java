package ensta;

public class Battleship extends AbstractShip 
{
	/**Constructeur valué 1 de Battleship, exercice 2
	*@param orientation Orientation du navire souhaitée
	*@return Pas de retour
	*/
	public Battleship(AbstractShip.Orientation orientation) 
	{
		super("Battleship", 'B', 4, orientation);
	}

	/**Constructeur par défaut de Battleship, exercice 2
	Orientation par défaut : 'E'
	@return Pas de retour
	*/
	public Battleship()
	{
		this(AbstractShip.Orientation.EAST);
	}


}
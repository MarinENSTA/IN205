package ensta;

public class Carrier extends AbstractShip 
{
	/**Constructeur valué 1 de Carrier exercice 2
	*@param orientation Orientation du navire souhaitée
	*@return Pas de retour
	*/
	public Carrier(AbstractShip.Orientation orientation) 
	{
		super("Carrier", 'C', 5, orientation);
	}

	/**Constructeur par défaut de Carrier, exercice 2
	Orientation par défaut : 'E'
	@return Pas de retour
	*/
	public Carrier()
	{
		this(AbstractShip.Orientation.EAST);
	}


}
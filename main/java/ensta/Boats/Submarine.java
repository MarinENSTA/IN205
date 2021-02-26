package ensta;

public class Submarine extends AbstractShip 
{
	/**Constructeur valué 1 de Submarine, exercice 2
	*@param orientation Orientation du navire souhaitée
	*@return Pas de retour
	*/
	public Submarine(AbstractShip.Orientation orientation) 
	{
		super("Submarine", 'S', 3, orientation);
	}

	/**Constructeur par défaut de Submarine, exercice 2
	Orientation par défaut : 'E'
	@return Pas de retour
	*/
	public Submarine()
	{
		this(AbstractShip.Orientation.EAST);
	}

}
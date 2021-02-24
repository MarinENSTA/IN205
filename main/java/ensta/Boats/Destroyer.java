package ensta;

public class Destroyer extends AbstractShip 
{

	/**Constructeur valué 1 de Destroyer, exercice 2
	*@param orientation Orientation du navire souhaitée
	*@return Pas de retour
	*/
	public Destroyer(char orientation) 
	{
		super("Destroyer", 'D', 2, orientation);
	}

	/**Constructeur par défaut de Destroyer, exercice 2
	Orientation par défaut : 'E'
	@return Pas de retour
	*/
	public Destroyer()
	{
		this('E');
	}


}
package ensta;

public class AbstractShip
{
	public char label;
	public String nom;
	public int size;
	public char orientation;

	/**Constructeur valué de navire, exercice 2
	@param nom Nom du navire
	@param label Label du navire (Lettre qui identifie son type)
	@param size Taille du navire
	@param orientation Orientation du navire (N,S,E ou W)
	@return Pas de retour
	*/
	public AbstractShip(String nom, char label, int size, char orientation)
	{
		this.nom = nom;
		this.label = label;
		this. size = size;
		this.orientation = orientation;
	}

	/** Mutateur pour l'orientation
	@param newOrientation Nouvelle orientation désirée du navire (N,S,E ou W)
	@return Pas de retour 
	*/
	public void setOrientation(char newOrientation)
	{
		this.orientation = newOrientation;
	}


}
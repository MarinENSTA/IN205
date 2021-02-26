package ensta;

public class AbstractShip
{
	public char label;
	public String nom;
	public int size;
	public char orientation;
	public int strikeCount;

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
		this.strikeCount = 0;
	}

	/** Mutateur pour l'orientation
	@param newOrientation Nouvelle orientation désirée du navire (N,S,E ou W)
	@return Pas de retour 
	*/
	public void setOrientation(char newOrientation)
	{
		this.orientation = newOrientation;
	}

	public String getName()
	{
		return this.nom;
	}

	public int getLength()
	{
		return this.size;
	}

	/**Vérification de si le navire a coulé
	@return un booléen 
	*/
	public boolean isSunk()
	{
		boolean sunk = strikeCount == size ? true : false ;
		return sunk;
	}

	/**
	Incrémentation du compteur de Strike sur le navire
	*/
	public void addStrike()
	{
		strikeCount++;
	}

}
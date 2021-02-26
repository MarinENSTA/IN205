package ensta;

public class ShipState
{
	public AbstractShip ship;
	public Boolean struck;

	/**
	Constructeur par défaut
	*/
	public ShipState()
	{
		struck = null;
	}

	/**
	Constructeur valué
	*/
	public ShipState(AbstractShip ship)
	{
		this.ship = ship;
		this.struck = false;
	}

	/**
	Fonction appelée quand navire touché
	*/
	public void addStrike()
	{
		if (struck != null && struck != true)
		{
			this.struck = true;
			ship.addStrike();
		}
	}

	/**
	On regarde si le navire est touché en ce point
	*/ 
	public Boolean isStruck()
	{
		return struck;
	}

	/**
	Override de toString pour ShipState
	@return Retour état de la case
	*/
	public String toString()
	{
		if (struck == null)
			return ".";

		else if (struck == true)
			return ColorUtil.colorize(ship.label, ColorUtil.Color.RED).toString();

		else
			return Character.toString(ship.label);

	}

	/**
	@return le navire auquel la case est liée
	*/
	public AbstractShip getShip()
	{
		return ship;
	}
	

}
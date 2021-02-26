package ensta;

public class Board //implements IBoard
{

	public ShipState[][] navires;
	public Boolean[][] frappes;
	private String nom; 
	public int size;

	/** Constructeur valué 1, exercice 1
	* @param boardsize taille de la grille
	* @param nom nom de la grille de jeu
	* @return pas de retour
	*/
	public Board(int boardsize, String nom)
	{
		this.navires = new ShipState[boardsize][boardsize];
		this.frappes = new Boolean[boardsize][boardsize];
		this.nom = nom;

		if (boardsize > 26){
			System.out.println("Initialisation plateau trop grande... \n Taille tronquée à 26.\n");
			this.size=26;
		}
		else
			this.size=boardsize;

		for (int i = 0 ; i < this.size ; i++)
		{
			for (int j = 0 ; j < this.size ; j++)
			{
				navires[i][j] = new ShipState();
				frappes[i][j] = null;
			}
		}
	}

	/** Constucteur valué 2, exercice 2, taille de grille 10 par défaut
	*@param nom nom de la grille de jeu
	*@return pas de retour
	*/
	public Board(String nom)
	{
		this(10,nom);
	}

	/** Impression des deux grilles de jeu d'un joueur
	@return pas de retour
	*/
	public void print()
	{
		try{
	    System.out.println(this.nom);

	    System.out.print("Navires :");
	    //Code en une ligne trouvé sur StackOverflow pour répéter une séquence (ici un espace)
	    System.out.print(new String(new char[this.size*2-9+7]).replace("\0", " "));
	    System.out.println("Frappes :");

	    //impression des lignes supérieures
	    this.printupperline();
	    System.out.print("  ");
	    this.printupperline();
	    System.out.print("\n");

	    //impression de la grille
	    this.printlines();
		}
		catch(Exception e)
		{
			System.out.println(e.getCause().toString());
		}
	}

	/** Impression d'une ligne spécifique pour les deux grilles
	@return pas de retour
	*/
	private void printlines()
	{
	  	int c = 0;

	  	for(int i=0 ; i<this.size ; i++){

	    	System.out.print(c + " ");

	    	if (c<10){
	    		System.out.print(" ");
	    	}

	    	for(int j=0 ; j<this.size ; j++){
	    		System.out.print(this.navires[i][j].toString() + " ");
	    	}
	    	System.out.print("  ");
	    	System.out.print(c + " ");

	    	if (c<10){
	    		System.out.print(" ");
	    	}

	    	for(int j=0 ; j<this.size ; j++){
	    		if (this.frappes[i][j] == null)
	    			System.out.print(". ");
	    		else if(this.frappes[i][j] == true)
	    			System.out.print(ColorUtil.colorize("X", ColorUtil.Color.RED)+" ");
	    		else 
	    			System.out.print ("X ");	    			
	    	}
	    	c++;
	    	System.out.print("\n");
	    }
	  	System.out.print("\n");
	}

	/** Impression des deux premières lignes desgrilles, un peu particulières
	@return pas de retour
	*/
	private void printupperline()
	{
		System.out.print("   ");
	    char d = 'A';

	    for (int c=0; c < this.size; c++){
	    	System.out.print(d + " ");
	    	d++;
	    }

	}

	/**Fonction de deepcopy de la grille de navires
	@return Retourne une grille de navire deepcopiée (non liée à la grille qu'elle copie)
	*/
	public ShipState[][] deepcopyShips()
	{
		ShipState[][] deepcopiedShips = new ShipState[this.size][this.size];
		for (int i = 0; i < this.size; i++)
		{
			for (int j = 0; j< this.size; j++)
			{
				if (this.navires[i][j].struck==null)
					deepcopiedShips[i][j]=new ShipState();
				else 
					deepcopiedShips[i][j]=this.navires[i][j];
			}
		}
		return deepcopiedShips;
	}

	// Javadoc déjà écrite dans IBoard.java pour les fonctions de cet exercice.

	public int getSize()
	{
		return this.size;
	}

	private ShipState[][] getShips()
	{
		return this.navires;
	}


	public void putShip(AbstractShip ship, int x, int y)
	{	
		ShipState[][] oldShips = new ShipState[this.size][this.size];
		oldShips = this.deepcopyShips();

		try
		{
			if (ship.orientation == 'E')
			{
				for (int j = 0; j < ship.size ; j++)
				{
					if (this.navires[y][x+j].isStruck()!=null)
					{
						throw new Illegal­Argument­Exception ("Bateau déjà présent à cet endroit");
					}

					navires[y][x+j] = new ShipState(ship);
				}
			}

			else if (ship.orientation == 'W')
			{	
				for (int j = 0; j < ship.size ; j++)
				{
					if (this.navires[y][x-j].isStruck() != null)
					{
						throw new Illegal­Argument­Exception ("Bateau déjà présent à cet endroit");
					}
					navires[y][x-j] = new ShipState(ship);
				}
			}

			else if (ship.orientation == 'S')
			{
				for (int i = 0; i < ship.size ; i++)
				{
					if (this.navires[y+i][x].isStruck()!= null)
					{
						throw new Illegal­Argument­Exception ("Bateau déjà présent à cet endroit");
					}
					navires[y+i][x] = new ShipState(ship);
				}
			}

			else if (ship.orientation == 'N')
			{
				for (int i = 0; i < ship.size ; i++)
				{
					if (this.navires[y-i][x].isStruck()!= null)
					{
						throw new Illegal­Argument­Exception ("Bateau déjà présent à cet endroit");
					}
					navires[y-i][x] = new ShipState(ship);
				}
			}
		}
		catch (Illegal­Argument­Exception e)
		{

			this.navires = oldShips;
			System.out.println("Problème de type : " + e.toString()+"\nCréation du navire sur la grille annulée");
		}
		catch (Exception e)
		{
			this.navires = oldShips;
			System.out.println("Problème d'indice de type : " + e.toString() );
			System.out.println("Initialisation du bateau '" + ship.nom.toString() + "' d'orientation '" + ship.orientation + "' annulée\n");
		}
	}

	public boolean hasShip(int x, int y) 
	{
		try
		{
		if (this.navires[y][x].isStruck() == null || this.navires[y][x].getShip().isSunk())
			return false;
		else
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Problème d'indice de type : " + e.toString() );
			System.out.println("Réponse à l'appel hasShip("+x+","+y+") impossible, false renvoyé par défaut\n");
			return false;
		}
	}

	public void setHit(boolean hit, int x, int y)
	{
		try{
		this.frappes[y][x] = hit;
		}
		catch (Exception e)
		{
			System.out.println("Problème d'indice de type : " + e.toString() );
			System.out.println("Frappe annulée\n");
		}
	}

	public Boolean getHit(int x, int y)
	{
		try{
		return this.frappes[y][x];
		}
		catch (Exception e)
		{
			System.out.println("Problème d'indice de type : " + e.toString() );
			System.out.println("Réponse à l'appel getHit("+x+","+y+") impossible, false renvoyé par défaut\n");
			return false;
		}
	}

	Hit sendHit(int x, int y)
	{	
		Hit res;
		if (navires[y][x].isStruck() == null || navires[y][x].isStruck() == true)
			//Si le navire est déjà touché on renvoie MISS
			return Hit.MISS;

		else
		{ 
			navires[y][x].addStrike();
			if (navires[y][x].getShip().isSunk())
			{
				res = Hit.fromInt(navires[y][x].getShip().size);
				System.out.println(res.toString()+" ==> coulé\n");
				return res;
			}
			else 
				return Hit.STRIKE;
		}
	}
	
}

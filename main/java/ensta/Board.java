package ensta;

public class Board //implements IBoard
{

	private char[][] navires;
	public boolean[][] frappes;
	private String nom; 
	public int size;

	/** Constructeur valué 1, exercice 1
	* @param boardsize taille de la grille
	* @param nom nom de la grille de jeu
	* @return pas de retour
	*/
	public Board(int boardsize, String nom)
	{
		this.navires = new char[boardsize][boardsize];
		this.frappes = new boolean[boardsize][boardsize];
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
				navires[i][j] = '.';
				frappes[i][j] = false;
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

	/** Impression d'une ligne pour les deux grilles
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
	    		System.out.print(this.navires[i][j] + " ");
	    	}
	    	System.out.print("  ");
	    	System.out.print(c + " ");

	    	if (c<10){
	    		System.out.print(" ");
	    	}

	    	for(int j=0 ; j<this.size ; j++){
	    		if(this.frappes[i][j])
	    			System.out.print("x ");
	    		else
	    			System.out.print(". ");
	    			
	    	}
	    	c++;
	    	System.out.print("\n");
	    }
	  	System.out.print("\n");
	}

	/** Impression des premières lignes de la grille un peu particulières
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

	/*
---------------------------------------------------------------------------------
	EXERCICES SUIVANTS NON INITIALISES DANS CE COMMIT

	public int getSize()
	{
		return this.size;
	}

	public void putShip(AbstractShip ship, int x, int y)
	{	

		try
		{
			if (ship.orientation == 'E')
			{
				for (int j = 0; j < ship.size ; j++)
				{
					navires[y][x+j] = ship.label;
				}
			}

			else if (ship.orientation == 'W')
			{	
				for (int j = 0; j < ship.size ; j++)
				{
					navires[y][x-j] = ship.label;
				}
			}

			else if (ship.orientation == 'S')
			{
				for (int i = 0; i < ship.size ; i++)
				{
					navires[y+i][x] = ship.label;
				}
			}

			else if (ship.orientation == 'N')
			{
				for (int i = 0; i < ship.size ; i++)
				{
					navires[y-i][x] = ship.label;
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Problème d'indice de type : " + e.toString() );
			System.out.println("Initialisation du bateau '" + ship.nom.toString() + "' d'orientation '" + ship.orientation + "' annulée\n");
		}

	}

	public boolean hasShip(int x, int y) 
	{
		try
		{
		if (this.navires[y][x] == '.')
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
	}*/


	
}

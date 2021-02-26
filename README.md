# Projet Bataille Navale - IN205

*Commentaires sur le projet numéro 1 d'in205*

### Exercice 1 : Affichage du "board"
Création de la classe Board, début du projet.

Pas de problème rencontré pour cette partie, j'avais déjà codé en C l'année dernière un Démineur sur le terminal,
je me suis inspiré de ces codes pour l'affichage des grilles.

### Exercice 2 : Création des classes des navires

Pas de grosse difficulté rencontrée pour cet exercice.
Il s'agit de répéter la même opération pour les différents types de navires en prenant garde à ne pas faire d'erreurs en copiant-collant
- Pour ranger les fichiers qui commencent à s'accumuler, je crée le sous-dossier "Boats"
- Je n'ai pas compris tout de suite qu'une énumération était la meilleure solution pour représenter les 4 directions au mieux. Je ne m'en suis rendu compte **qu'à l'exercice 7 avec BattleShipsAI**, ce qui m'a valu quelques temps de debug pour rendre les deux classes compatibles (et donc créer l'enum Orientation !).

### Exercice 3 : Placement des navires

J'ai passé quelques temps sur cet exercice : 
- J'ai du apprendre à maitriser les blocs *try ... catch* en Java.
- Je me suis rendu compte que j'inversais systématiquement *x* et *y* depuis le début du projet, ce que j'ai corrigé en voyant l'affichage erroné à l'écran
- Les indices ne posent étonnament pas de problème : Les indexations apparentes sur la grille commencent à 0, les tableaux Java aussi.

### Exercice 4 : Entrées utilisateur

L'exercice 4 est un peu frustrant puisqu'on n'a pas d'application concrète de la classe **Player** avant l'exercice 8.
La classe InputHelper est très utile pour cet exercice et le reste du projet, elle épargne des longues heures d'apprentissages des méthodes de Java.

### Exercice 5 : Etat des navires et des frappes

L'étape de "Refactoring" est un peu frustrante, dans la mesure où elle fait modifier en profondeur des codes qui fonctionnent bien et qu'on ne veut plus modifier. J'ai passé quelques temps dessus.
Les modifications apportées (ie. changement de types) sont néanmoins très pertinentes pour la suite du projet : La classe ShipState est très bien faite et aide à mieux comprendre les enjeux de ce que l'on est en train de coder.

### Exercice 6 : Envoyer des frappes

J'ai passé quelques temps à comprendre l'énoncé qui ne m'a pas semblé toujours très clair pour cet exercice (*notamment sur ce qu'il fallait faire à ce moment là sur PLayer.sendHit()*).
La bonne compréhension de la classe ColorUtil m'a posé quelques difficultés et un peu de temps.
Enfin, Hit est une enumération très bien construite et utile pour le projet, qui montre bien ici la pertinence de choisir un *enum* pour représenter les différentes frappes.

### Exercice 7 : Intelligence artificielle

Cet exercice m'a pris beaucoup de temps à faire :
- Il fallait étudier et comprendre les fonctions de **BattleShipsAI** pour être bien sur de ce que j'étais en train de faire
- C'est le premier contact entre tout le code que j'avais fait pendant les premiers exercices et une Classe qui implémente véritablement le jeu. J'ai du adapter quelques méthodes et ma façon de représenter les directions d'un navire (que je n'avais pas codées en *enum* au début du projet)

L'implémentation de TestGame n'était pas très compliquée.

### Exercice 8 : Place au jeu !

On utilise dans cet exercice pour la première fois véritablement la classe **Player** et sa méthode sendHit que l'on avait codée à l'exercice 4. 
Ceci a demandé quasi automatiquement un peu de temps pour débugger tout ce qui n'allait pas.

J'ai commenté le contenu des focntions relatives aux exercices bonus qui envoyaient systématiquement des erreurs à la compilation même si je ne les utilisais pas.

Le tour de jeu run() n'a pas été trop compliqué à coder (les lignes à ajouter étaient très claires et ne nécessitaient pas de réfléchir trop).

Un aspect a pris du temps néanmoins : pour faire des essais sur les tours de jeux, je devais passer systématiquement par l'initialisation des navires de mon **Board** manuellement, ce était un peu long.




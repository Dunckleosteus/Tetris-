public class Tetromino{
// declarer les variables
  private int  forme; 
  private int vitesse;
  private int coordox;
  private int coordoy;
//constructeurs
  public Tetromino (int x,boolean y){
    forme = x; 
    vitesse = 1;
    if(y) // actuel
    {
      coordox = 400;
      coordoy = 100;
    }
    else // futur
    {
      coordox = 800;
      coordoy = 2000;
    }
    // coordoonnees a modifier
    tabTetro = new Bloc[4][4];
    if(forme == 1)
    {
      for(int i=0;i<4;i++)
      {
        for(int j=0;j<4;j++)
        {
          tabTetro[i][j] = new Bloc(0);
        }
      }
      tabTetro[1][0].set_Type(forme);
      tabTetro[1][1].set_Type(forme);
      tabTetro[1][2].set_Type(forme);
      tabTetro[1][3].set_Type(forme);
      tabTetro[1][4].set_Type(forme);
      tabTetro[1][5].set_Type(forme);
    }
    // etc.
  }
// acesseurs
    public int get_Forme(){
    return Forme;
  }
    public int get_Vitesse(){
    return Vitesse;
  }
  public int get_Coordox(){
    return Coordox;
  }
  public int get_Coordoy(){
    return Coordoy;
  }
//modifieurs
  public void set_Forme(int x){
    Forme= x;
  }
  public void set_Vitesse(int x){
    Vitesse= x;
  }
  public void set_Coordox(int x){
   Coordox = x;
  }
  public void set_Coordoy(int x){
    Coordoy= x;
  }
} 
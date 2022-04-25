public class Tetromino{
// declarer les variables
  private int forme; 
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
    return forme;
  }
    public int get_Vitesse(){
    return vitesse;
  }
  public int get_Coordox(){
    return coordox;
  }
  public int get_Coordoy(){
    return coordoy;
  }
//modifieurs
  public void set_Forme(int x){
    forme= x;
  }
  public void set_Vitesse(int x){
    vitesse= x;
  }
  public void set_Coordox(int x){
   coordox = x;
  }
  public void set_Coordoy(int x){
    coordoy= x;
  }
} 
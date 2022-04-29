public class Tetromino{
// declarer les variables
  private int forme; 
  private int vitesse;
  private int coordox;
  private int coordoy;
  private Bloc tabTetro[][];
//constructeurs
  public Tetromino (int x,boolean y){
    forme = x; 
    vitesse = 1;
    if(y) // actuel
    {
      coordox = 100+60;
      coordoy = 40;
    }
    else // futur
    {
      coordox = 800;
      coordoy = 2000;
    }
    // coordoonnees a modifier
    tabTetro = new Bloc[4][4];
    for (int l = 0; l < 4; l++)
    {
      for (int c = 0; c < 4; c++)
      {
        tabTetro[l][c] = new Bloc(0);
      }
    }
    if(forme == 1)
    {
      tabTetro[1][0] = new Bloc (forme);
      tabTetro[1][1] = new Bloc (forme);
      tabTetro[1][2] = new Bloc (forme);
      tabTetro[1][3] = new Bloc (forme);
    }
    if(forme == 2)
    {
      tabTetro[0][0] = new Bloc (forme);
      tabTetro[0][1] = new Bloc (forme);
      tabTetro[1][1] = new Bloc (forme);
      tabTetro[2][1] = new Bloc (forme);
    }
    if(forme == 3)
    {
      tabTetro[0][0] = new Bloc (forme);
      tabTetro[0][1] = new Bloc (forme);
      tabTetro[0][2] = new Bloc (forme);
      tabTetro[1][1] = new Bloc (forme);
    }
    if(forme == 4)
    {
      tabTetro[0][0] = new Bloc (forme);
      tabTetro[0][1] = new Bloc (forme);
      tabTetro[1][1] = new Bloc (forme);
      tabTetro[1][2] = new Bloc (forme);
    }
    if(forme == 5)
    {
      tabTetro[0][0] = new Bloc (forme);
      tabTetro[0][1] = new Bloc (forme);
      tabTetro[1][0] = new Bloc (forme);
      tabTetro[1][1] = new Bloc (forme);
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
  public Bloc getTabTetro (int l, int c)
  {
    return tabTetro[l][c];
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
public class Tetromino{
// declarer les variables
  private int  Forme; 
  private int Vitesse;
  private int Coordox;
  private int Coordoy;
//constructeurs
  public Tetromino (int x,int y, int z, int g){
    Forme = x; 
    Vitesse = y;
    Coordox = z;
    Coordoy = g;
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
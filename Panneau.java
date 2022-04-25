import java.awt.*;
import javax.swing.*; 
public class Panneau extends JPanel{// jpannel
  private int nbligne;
  private int nbcolonne;
  private int score;
  private int difficulte;
  private int ecran;
  private String imagefond;
  private String pathmusique;
  private Tetromino tetroFutur;
  private Tetromino tetroActuel;
  private Bloc[][] grille;

  public Panneau (){
    nbcolonne = 11;
    nbligne = 20;
    grille = new Bloc[nbligne][nbcolonne];
    for(int i=0;i<nbligne;i++)
    {
      for(int j=0;j<nbcolonne;j++)
      {
        grille[i][j] = new Bloc(0);
      }
    }
    tetroFutur = new Tetromino((int)Math.ceil(Math.random()*5),false);
    tetroActuel = new Tetromino((int)Math.ceil(Math.random()*5),true);
  }

    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.green);
      g.fillRect(0,0, 200,20);
      g.setColor(Color.red);
      g.fillRect(10,10, 300,30);
      g.setColor(Color.blue);
      g.fillRect(50, 250, 100, 300 );
    }

// accesseurs pour actuel, futur et grille
  public int get_nbcolonne(){
    return nbcolonne;
  }
   public int get_nbligne(){
    return nbligne;
  }
   public int get_score(){
    return score;
  }
   public int get_difficulte(){
    return difficulte;
  }
   public int get_ecran(){
    return ecran;
  }
   public String get_imagefond(){
    return imagefond;
  }
   public String get_pathmusique(){
    return pathmusique;
  }
  public void set_nbcolonne(int x){
    nbcolonne = x;
  }
  public void set_nbligne(int x){
    nbligne = x;
  }
  public void set_score(int x){
    score= x;
  }
  public void set_difficulte(int x){
    difficulte = x;
  }
  public void set_ecran(int x){
    ecran = x;
  }
  public void set_imagefond(String x){
    imagefond = x;
  
  }
  public void set_pathmusique(String x){
    pathmusique = x;
  }
}
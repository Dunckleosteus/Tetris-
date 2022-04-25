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
  private int largeur_ecran;
  private int hauteur_ecran; 
  private int unite; 


  public Panneau (int x, int y){
    nbcolonne = 11;
    nbligne = 20;
    grille = new Bloc[nbligne][nbcolonne];
    largeur_ecran = 200;
    hauteur_ecran = 200;
    unite = largeur_ecran/10; 
  }

    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      g.fillRect(0,0, largeur_ecran, hauteur_ecran);
      g.setColor(Color.green);
      for (int i=0; i<10; i++){
        g.drawLine(0,i*unite,hauteur_ecran,i*unite);
      }
      for (int i=0; i<10; i++){
        g.drawLine(i*unite,0,i*unite,largeur_ecran);
      }
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
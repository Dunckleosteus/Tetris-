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
    for (int l = 0; l < nbligne; l++)
    {
      for (int c = 0; c < nbcolonne; c++)
      {
        grille[l][c] = new Bloc(0);
      }
    }
    largeur_ecran = 200;
    hauteur_ecran = 200;
    unite = largeur_ecran/10; 
    tetroFutur = new Tetromino((int)Math.ceil(Math.random()*5), false);
    tetroActuel = new Tetromino((int)Math.ceil(Math.random()*5), true);
  }

    public void paintComponent(Graphics g){
      super.paintComponent(g);

      g.setColor(Color.green);
      g.fillRect(0,0, 200,20);
      g.setColor(Color.red);
      g.fillRect(10,10, 300,30);
      g.setColor(Color.blue);
      g.fillRect(50, 250, 100, 300 );

      g.setColor(Color.black);
      g.fillRect(0,0, largeur_ecran, hauteur_ecran);
      
      g.drawImage(Toolkit.getDefaultToolkit().getImage("fond.png"), 0, 0, 500, 500, this);

      /*for (int i=0; i<10; i++){
        g.drawLine(0,i*unite,hauteur_ecran,i*unite);
      }
      for (int i=0; i<10; i++){
        g.drawLine(i*unite,0,i*unite,largeur_ecran);
      }*/

      for (int l = 0; l < nbligne; l++)
      {
        for (int c = 0; c < nbcolonne; c++)
        {
          g.setColor(Color.BLACK);
          g.fillRect(c * 20 + 100, l * 20 + 40, 20, 20);

          g.drawImage(Toolkit.getDefaultToolkit().getImage(grille[l][c].get_Image()), c * 20 + 100, l * 20 + 40, 20, 20, this);

          g.setColor(Color.green);
          g.drawRect(c * 20 + 100, l * 20 + 40, 20, 20);
        }
      }

      for (int l = 0; l < 4; l++)
      {
        for (int c = 0; c < 4; c++)
        {
          g.setColor(Color.BLACK);
          g.fillRect(c * 20, l * 20, 20, 20);

          g.drawImage(Toolkit.getDefaultToolkit().getImage(tetroFutur.getTabTetro(l, c).get_Image()), c * 20, l * 20, 20, 20, this);

          g.setColor(Color.green);
          g.drawRect(c * 20, l * 20, 20, 20);
        }
      }

      for (int l = 0; l < 4; l++)
      {
        for (int c = 0; c < 4; c++)
        {
          g.setColor(Color.BLACK);
          g.fillRect(c * 20 + tetroActuel.get_Coordox(), l * 20 + tetroActuel.get_Coordoy(), 20, 20);

          g.drawImage(Toolkit.getDefaultToolkit().getImage(tetroActuel.getTabTetro(l, c).get_Image()), c * 20 + tetroActuel.get_Coordox(), l * 20 + tetroActuel.get_Coordoy(), 20, 20, this);

          g.setColor(Color.YELLOW);
          g.drawRect(c * 20 + tetroActuel.get_Coordox(), l * 20 + tetroActuel.get_Coordoy(), 20, 20);
        }
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

  public void chuteTetroActuel ()
  {
    boolean chute = true;
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
      {
        if(tetroActuel.getTabTetro(i,j).get_Type()!=0 && (tetroActuel.get_Coordoy()-40)/20+i+1==20)
        {
          chute = false;
        }
        else
        {
          if(tetroActuel.getTabTetro(i,j).get_Type()!=0 && grille[(tetroActuel.get_Coordoy()-40)/20+i+1][(tetroActuel.get_Coordox()-100)/20+j].get_Type()!=0)
          {
            chute = false;
          }
        }
      }
    }
    if(chute)
    {
      tetroActuel.set_Coordoy(tetroActuel.get_Coordoy() + 20);
    }
    else
    {
      int ligne = (tetroActuel.get_Coordoy() - 40) / 20;
      int colonne = (tetroActuel.get_Coordox() - 100) / 20;
      for(int i=0;i<4;i++)
      {
        for(int j=0;j<4;j++)
        {
          if (tetroActuel.getTabTetro(i,j).get_Type()!=0)
          {
            grille[ligne + i][colonne + j].recopie(tetroActuel.getTabTetro(i,j));
          }
        }
      }
      tetroActuel.set_Coordoy(40);
      tetroActuel = new Tetromino(tetroFutur.get_Forme(), true);// prend la forme du tetromino futur
      tetroFutur = new Tetromino((int)Math.ceil(Math.random()*5), false);// nouveau tetro futur 
    }
  }

  public void deplacementTetroDroite()
  {
    tetroActuel.set_Coordox(tetroActuel.get_Coordox() + 20);
  }
}

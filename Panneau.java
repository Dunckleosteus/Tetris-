import java.awt.*;
import javax.swing.*; 
public class Panneau extends JPanel{// jpannel
  private int Nbligne;
  private int Nbcolonne;
  private int Score;
  private int Difficulte;
  private int Ecran;
  private String Imagefond;
  private String Pathmusique;

  public Panneau (int Nbcol,int Nblig){
    Nbcolonne = Nbcol;
    Nbligne = Nblig;
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
  public int get_Nbcolonne(){
    return Nbcolonne;
  }
   public int get_Nbligne(){
    return Nbligne;
  }
   public int get_Score(){
    return Score;
  }
   public int get_Difficulte(){
    return Difficulte;
  }
   public int get_Ecran(){
    return Ecran;
  }
   public String get_Imagefond(){
    return Imagefond;
  }
   public String get_Pathmusique(){
    return Pathmusique;
  }
  public void set_Nbcolonne(int x){
    Nbcolonne = x;
  }
  public void set_Nbligne(int x){
    Nbligne = x;
  }
  public void set_Score(int x){
    Score= x;
  }
  public void set_Difficulte(int x){
    Difficulte = x;
  }
  public void set_Ecran(int x){
    Ecran = x;
  }
  public void set_Imagefond(String x){
    Imagefond = x;
  
  }
  public void set_Pathmusique(String x){
    Pathmusique = x;
  }
}
// les imports 
import java.awt.*;
import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenetre extends JFrame implements KeyListener{//jframe
private int bite;
public Panneau pan;// declaration de panneau
  public Fenetre(){// COnstructeur de fenetre 
    this.setTitle ("Tetris");
    this.setSize (500,500);//taille de la fenetre
    // ferme le programme quand la fenetre est etteinte
    // !IMPORTANT !!!!
    //oublie pas de cliquer sur la fenetre avant d'utiliser la clavier 
    this.addKeyListener(this);// il faut mettre cette ligne pour que la fenetre enregistre les pressions sur le boutton !!
    // IMPORTANT
    this.setDefaultCloseOperation (EXIT_ON_CLOSE);
    pan = new Panneau(10,20);// initialisation de pannea
    this.setContentPane(pan);//
    pan.setBackground(Color.pink);//couleur de fond
  }

  public int get_bite(){//accesseur de bite
    return bite;
  }
  public void set_bite(int a){//modifieur de bite
    bite = a; // bite prend la valeur a 
  }
/*
ces trois @Override sont obrigatoires des que les 
*/
   @Override
 public void keyTyped(KeyEvent e) {
  
 }

 @Override
 public void keyPressed(KeyEvent e) {
   System.out.println(e.getKeyChar());//
 }
 @Override
 public void keyReleased(KeyEvent e) {}
  
}
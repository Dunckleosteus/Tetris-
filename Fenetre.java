/// les imports 
import java.awt.*;
import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

public class Fenetre extends JFrame implements KeyListener, Runnable
{//jframe
  private int bite;
  private JLabel label; 
  private Thread t;
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
    pan = new Panneau(10,20);// initialisation de pannea*
    pan.setLayout(null);
    this.setContentPane(pan);//
    label = new JLabel(); //create a label
    label.setText("Score"); //set text of label
    label.setBounds(400, 250, 100, 50);
    label.setForeground(new Color(0x00FF00));
    label = new JLabel();
    label.setText("Quitter");
    label.setBounds(400, 350, 100, 50);
    label = new JLabel();
    label.setForeground(new Color(0x00FF00));
    label = new JLabel();
    label.setText("Difficulté");
    label.setBounds(400, 300, 100, 50);
    label.setForeground(new Color(0x00FF00));
    pan.setBackground(Color.pink);//couleur de fond
    pan.add(label);

    t = new Thread (this);
    t.start();
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

  public void run ()
  {
    try 
    {
      while (true)
      {
        pan.chuteTetroActuel();
        pan.repaint();// rafraichi la page
        t.sleep(1000);// temp a attendre
      }
    }
    catch (Exception e) {}
  }
  
}
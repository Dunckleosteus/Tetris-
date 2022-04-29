public class Bloc{
  //déclarer variables
  private String image;
  private int type;

  //constructeurs
   public Bloc(int y){
      type = y;
    if(type==0)
    {
      image = "Bleu.png";
    }
    if(type==1)
    {
      image = "Bleu.png";
    }
    if(type==2)
    {
      image = "Rouge.png";
    }
     if(type==3)
    {
      image = "Jaune.png";
    }
     if(type==4)
    {
      image = "Vert.png";
    }
     if(type==5)
    {
      image = "Violet.png";
    }
    if(type == 6){
      image = "Violet.png"
    }
       
   }
  //accesseurs
   public String get_Image(){
    return image;
  }
  public int get_Type(){
    return type;
  }
  //modifieurs
  public void set_Image(String x){
    image= x;
  }
  public void set_Type(int x)
  {
    type= x;
    if(type==0)
    {
      image = "";
    }
    if(type==1)
    {
      image = "Bleu.png";
    }
    if(type==2)
    {
      image = "Rouge.png";
    }
     if(type==3)
    {
      image = "Jaune.png";
    }
     if(type==4)
    {
      image = "Vert.png";
    }
     if(type==5)
    {
      image = "Violet.png";
    }
  }
}
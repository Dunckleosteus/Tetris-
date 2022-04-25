public class Bloc{
  //déclarer variables
  private String image;
  private int type;

  //constructeurs
   public Bloc(int y){
      type = y;
     if (type==0)
    {
      image = "";
    }
    if(type==1)
    {
      image = "Bleu.jpg";
    }
    if(type==2)
    {
      image = "Rouge.jpg";
    }
     if(type==3)
    {
      image = "Jaune.jpg";
    }
     if(type==4)
    {
      image = "Vert.jpg";
    }
     if(type==5)
    {
      image = "Violet.jpg";
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
      image = "Bleu.jpg";
    }
    if(type==2)
    {
      image = "Rouge.jpg";
    }
     if(type==3)
    {
      image = "Jaune.jpg";
    }
     if(type==4)
    {
      image = "Vert.jpg";
    }
     if(type==5)
    {
      image = "Violet.jpg";
    }
  }
}
public class Bloc{
  //déclarer variables
  private String Image;
  private int Type;

  //constructeurs
   public Bloc(int y){
      Type = y;
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
    return Image;
  }
  public int get_Type(){
    return Type;
  }
  //modifieurs
  public void set_Image(String x){
    Image= x;
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
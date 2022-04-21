public class Bloc{
  //déclarer variables
  private String Image;
  private int Type;

  //constructeurs
   public Bloc(String x,int y){
      Image = x;
      Type = y;
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
  public void set_Type(int x){
    Type= x;
  }
}
package wizard_management;

public class Wand implements Defendable{

  int magic_points;
  String material;

  public Wand(String material, int magic_points){
    this.magic_points = magic_points;
    this.material = material;
    
  }

  public String defend(){
    return "Take this Voldemort!";
  }

  public int getPower(){
    return this.magic_points;
  }

  public String getMaterial(){
    return this.material;
  }
}
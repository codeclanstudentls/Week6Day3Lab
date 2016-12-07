package wizard_management;

public class Wizard {
  String name;
  Flyable ride;
  Defendable protect;

  public Wizard(String name, Flyable ride, Defendable protect){
    this.name = name;
    this.ride = ride;
    this.protect = protect;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public Defendable getProtect(){
    return this.protect;
  }

  public String defend() {
    return this.protect.defend();
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

}
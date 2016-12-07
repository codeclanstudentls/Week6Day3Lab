import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Mop mop;
  Dragon dragon;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    mop = new Mop("Vileda");
    dragon = new Dragon("Tilly");
    wizard = new Wizard("Toby", broomstick, mop);

  }

  @Test 
  public void canSetRide(){
    // Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyDragon(){
    wizard = new Wizard("Dumbledore", dragon, mop);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick broomstick = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", broomstick.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canDefend(){
    assertEquals("Soggy mop to the face!", wizard.defend());
  }
}
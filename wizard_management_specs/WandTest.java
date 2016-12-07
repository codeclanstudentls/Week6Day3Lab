import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WandTest {

  Wand wand;

  @Before
  public void before(){
    wand = new Wand("Oak", 10);
  }

  @Test
  public void hasPower(){
    assertEquals(10, wand.getPower());
  }
  
}
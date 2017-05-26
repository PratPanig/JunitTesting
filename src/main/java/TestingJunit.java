import static org.junit.Assert.*;

import org.junit.Test;
public class TestingJunit {
   @Test
   public void checkSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup",str);
      
   }
}
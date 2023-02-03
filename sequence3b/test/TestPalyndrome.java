import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestPalyndrome
{
   @Test
   public void testPalyndrome()
   {
     String s = null;        
     boolean ok = false;

     s = "lol";   
     ok = StringUtils.estPalyndrome(s);
     assertTrue(ok);

     s = "pipo";   
     ok = StringUtils.estPalyndrome(s);
     assertFalse(ok);
   }

   @Test
   public void testLireInt()
   {
       
     String s = null;        
     int n = 0;

     s = "1";
     n = Palyndrome.lireInt(s);
     assertEquals(1, n);

     s = "a";
     n = Palyndrome.lireInt(s);
     assertEquals(-1, n);
   }
}

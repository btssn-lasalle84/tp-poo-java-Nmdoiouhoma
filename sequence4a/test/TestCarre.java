import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestCarre
{
   @Test
   public void testCarre()
   {
     Carre carre = new Carre(5.);
     assertTrue(carre instanceof Figure);
     assertEquals(5., carre.getLargeur());
     assertEquals(0., carre.getX());
     assertEquals(0., carre.getY());
     assertEquals(0., carre.getZ());
   }

   @Test
   public void testCarreDescription()
   {
     Carre carre = new Carre(5.);
     assertEquals("Figure <|--- Carre", carre.getDescription());
   }

   @Test
   public void testCarreToString()
   {
     Carre carre = new Carre(5.);
     assertEquals("0.0 0.0 0.0 5.0", carre.toString());
   }  

   @Test
   public void testCarrePerimetre()
   {
       
     Carre carre = new Carre(5.);
     assertEquals(20.0, carre.perimetre());
   }

   @Test
   public void testCarreAire()
   {
       
     Carre carre = new Carre(5.);
     assertEquals(25., carre.aire());
   }

   @Test
   public void testCarreVolume()
   {
       
     Carre carre = new Carre(5.);
     assertEquals(0., carre.volume());
   }
}

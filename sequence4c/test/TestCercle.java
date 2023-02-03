import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestCercle
{
   @Test
   public void testCercle()
   {
     Cercle cercle = new Cercle(2.);
     assertTrue(cercle instanceof Figure);
     assertEquals(2., cercle.getRayon());
     assertEquals(0., cercle.getX());
     assertEquals(0., cercle.getY());
     assertEquals(0., cercle.getZ());
   }

   @Test
   public void testCercleDescription()
   {
     Cercle cercle = new Cercle(2.);
     assertEquals("Figure <|--- Cercle", cercle.getDescription());
   }

   @Test
   public void testCercleToString()
   {
     Cercle cercle = new Cercle(2.);
     assertEquals("0.0 0.0 0.0 2.0", cercle.toString());
   }  

   @Test
   public void testCerclePerimetre()
   {
       
     Cercle cercle = new Cercle(2.);
     assertEquals(12.566370614359172, cercle.perimetre());
   }

   @Test
   public void testCercleAire()
   {
       
     Cercle cercle = new Cercle(2.);
     assertEquals(12.566370614359172, cercle.aire());
   }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestParallelepipede
{
   @Test
   public void testParallelepipede()
   {
     Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
     assertTrue(parallelepipede instanceof Figure);
     assertTrue(parallelepipede instanceof Rectangle);
     assertEquals(5., parallelepipede.getLargeur());
     assertEquals(4., parallelepipede.getLongueur());
     assertEquals(0., parallelepipede.getX());
     assertEquals(0., parallelepipede.getY());
     assertEquals(0., parallelepipede.getZ());
   }

   @Test
   public void testParallelepipedeDescription()
   {
     Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
     assertEquals("Figure <|--- Rectangle <|--- Parallelepipede", parallelepipede.getDescription());
   }

   @Test
   public void testParallelepipedeToString()
   {
     Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
     assertEquals("0.0 0.0 0.0 5.0 4.0 9.0 0.0 0.0", parallelepipede.toString());
   }  

   @Test
   public void testParallelepipedePerimetre()
   {
       
     Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
     assertEquals(0.0, parallelepipede.perimetre());
   }

   @Test
   public void testParallelepipedeAire()
   {
       
     Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
     assertEquals(202.0, parallelepipede.aire());
   }

   @Test
   public void testParallelepipedeVolume()
   {
       
     Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
     assertEquals(180.0, parallelepipede.volume());
   }
}

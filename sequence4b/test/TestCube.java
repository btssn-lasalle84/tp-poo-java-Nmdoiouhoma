import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestCube
{
   @Test
   public void testCube()
   {
     Cube cube = new Cube(6.);
     assertTrue(cube instanceof Figure);
     assertTrue(cube instanceof Carre);
     assertEquals(6., cube.getLargeur());
     assertEquals(0., cube.getX());
     assertEquals(0., cube.getY());
     assertEquals(0., cube.getZ());
   }

   @Test
   public void testCubeDescription()
   {
     Cube cube = new Cube(6.);
     assertEquals("Figure <|--- Carre <|--- Cube", cube.getDescription());
   }

   @Test
   public void testCubeToString()
   {
     Cube cube = new Cube(6.);
     assertEquals("0.0 0.0 0.0 6.0", cube.toString());
   }  

   @Test
   public void testCubePerimetre()
   {
       
     Cube cube = new Cube(6.);
     assertEquals(0.0, cube.perimetre());
   }

   @Test
   public void testCubeAire()
   {
       
     Cube cube = new Cube(6.);
     assertEquals(216.0, cube.aire());
   }

   @Test
   public void testCubeVolume()
   {
       
     Cube cube = new Cube(6.);
     assertEquals(216.0, cube.volume());
   }
}

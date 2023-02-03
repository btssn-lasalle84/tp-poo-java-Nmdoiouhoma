import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestSphere
{
   @Test
   public void testSphere()
   {
     Sphere sphere = new Sphere(3.);
     assertTrue(sphere instanceof Figure);
     assertTrue(sphere instanceof Cercle);
     assertEquals(3., sphere.getRayon());
     assertEquals(0., sphere.getX());
     assertEquals(0., sphere.getY());
     assertEquals(0., sphere.getZ());
   }

   @Test
   public void testSphereDescription()
   {
     Sphere sphere = new Sphere(3.);
     assertEquals("Figure <|--- Cercle <|--- Sphere", sphere.getDescription());
   }

   @Test
   public void testSphereToString()
   {
     Sphere sphere = new Sphere(3.);
     assertEquals("0.0 0.0 0.0 3.0", sphere.toString());
   }  

   @Test
   public void testSpherePerimetre()
   {
       
     Sphere sphere = new Sphere(3.);
     assertEquals(0.0, sphere.perimetre());
   }

   @Test
   public void testSphereAire()
   {
       
     Sphere sphere = new Sphere(3.);
     assertEquals(113.09733552923255, sphere.aire());
   }

   @Test
   public void testSphereVolume()
   {
       
     Sphere sphere = new Sphere(3.);
     assertEquals(113.09733552923255, sphere.volume());
   }
}

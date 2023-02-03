import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestRectangle
{
   @Test
   public void testRectangle()
   {
     Rectangle rectangle = new Rectangle(5., 4.);
     assertTrue(rectangle instanceof Figure);
     assertEquals(5., rectangle.getLargeur());
     assertEquals(4., rectangle.getLongueur());
     assertEquals(0., rectangle.getX());
     assertEquals(0., rectangle.getY());
     assertEquals(0., rectangle.getZ());
   }

   @Test
   public void testRectangleDescription()
   {
     Rectangle rectangle = new Rectangle(5., 4.);
     assertEquals("Figure <|--- Rectangle", rectangle.getDescription());
   }

   @Test
   public void testRectangleToString()
   {
     Rectangle rectangle = new Rectangle(5., 4.);
     assertEquals("0.0 0.0 0.0 5.0 4.0", rectangle.toString());
   }  

   @Test
   public void testRectanglePerimetre()
   {
       
     Rectangle rectangle = new Rectangle(5., 4.);
     assertEquals(18.0, rectangle.perimetre());
   }

   @Test
   public void testRectangleAire()
   {
       
     Rectangle rectangle = new Rectangle(5., 4.);
     assertEquals(20., rectangle.aire());
   }

   @Test
   public void testRectangleVolume()
   {
       
     Rectangle rectangle = new Rectangle(5., 4.);
     assertEquals(0., rectangle.volume());
   }
}

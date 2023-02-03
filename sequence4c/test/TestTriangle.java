import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestTriangle
{
   @Test
   public void testTriangle()
   {
     Triangle triangle = new Triangle(5., 8.);
     assertTrue(triangle instanceof Figure);
     assertEquals(5., triangle.getBase());
     assertEquals(8., triangle.getHauteur());
     assertEquals(0., triangle.getX());
     assertEquals(0., triangle.getY());
     assertEquals(0., triangle.getZ());
   }

   @Test
   public void testTriangleDescription()
   {
     Triangle triangle = new Triangle(5., 8.);
     assertEquals("Figure <|--- Triangle", triangle.getDescription());
   }

   @Test
   public void testTriangleToString()
   {
     Triangle triangle = new Triangle(5., 8.);
     assertEquals("0.0 0.0 0.0 5.0 8.0", triangle.toString());
   }  

   @Test
   public void testTrianglePerimetre()
   {
       
     Triangle triangle = new Triangle(5., 8.);
     assertEquals(22.4339811320566, triangle.perimetre());
   }

   @Test
   public void testTriangleAire()
   {
       
     Triangle triangle = new Triangle(5., 8.);
     assertEquals(20., triangle.aire());
   }
}

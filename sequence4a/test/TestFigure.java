import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestFigure
{
   @Test
   public void testFigure()
   {
     Figure figure = new Figure(5., 8., 2.);
     assertEquals(5., figure.getX());
     assertEquals(8., figure.getY());
     assertEquals(2., figure.getZ());
   }

   @Test
   public void testFigureDescription()
   {
     Figure figure = new Figure(5., 8., 2.);
     assertEquals("Figure", figure.getDescription());
   }

   @Test
   public void testFigureToString()
   {
     Figure figure = new Figure(5., 8., 2.);
     assertEquals("5.0 8.0 2.0", figure.toString());
   } 

   @Test
   public void testFigurePerimetre()
   {
       
     Figure figure = new Figure(5, 8, 2);
     assertEquals(0., figure.perimetre());
   }

   @Test
   public void testFigureAire()
   {
       
     Figure figure = new Figure(5, 8, 2);
     assertEquals(0., figure.aire());
   }

   @Test
   public void testFigureVolume()
   {
       
     Figure figure = new Figure(5, 8, 2);
     assertEquals(0., figure.volume());
   }
}

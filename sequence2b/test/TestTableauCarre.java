import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestTableauCarre
{
   @Test
   public void testTableauCarre()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     TableauCarre.main(null);

     // assertion
     assertEquals("1 a pour carre 1\n3 a pour carre 9\n5 a pour carre 25\n7 a pour carre 49\n9 a pour carre 81\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testConstante()
   {
     assertEquals(5, TableauCarre.NB_VALEURS);
   }
}

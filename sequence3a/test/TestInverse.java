import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestInverse
{
   @Test
   public void testInverse()
   {
     String inverse = StringUtils.inverse("pipo");
     assertEquals("opip", inverse);

     inverse = StringUtils.inverse("opip");
     assertEquals("pipo", inverse);
   }

   @Test
   public void testMain1()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     String[] args;
     args = new String[1];
     args[0] = "pipo";

     Inverse.main(args);
     assertEquals("pipo\nopip\n", bos.toString());

     System.setOut(originalOut);
   }

   @Test
   public void testMain2()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     String[] args;
     args = new String[1];
     args[0] = "";
     Inverse.main(args);
     assertEquals("\n\n", bos.toString());

     System.setOut(originalOut);
   }
}

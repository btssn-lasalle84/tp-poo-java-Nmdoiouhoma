import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestFizzBuzz
{
   @Test
   public void testFizz()
   {
     myassert(5, "5 -> Fizz\n");
     myassert(10, "10 -> Fizz\n");
     myassert(15, "15 -> Fizz\n");
     myassert(100, "100 -> Fizz\n");
     mynassert(35, "35 -> Fizz\n");
   }

   @Test
   public void testBuzz()
   {
     myassert(7, "7 -> Buzz\n");
     myassert(14, "14 -> Buzz\n");
     myassert(21, "21 -> Buzz\n");
     myassert(98, "98 -> Buzz\n");
     mynassert(35, "35 -> Buzz\n");
   }

   @Test
   public void testNoneFizzBuzz()
   {
     myassert(1, "1\n");
     myassert(4, "4\n");
     myassert(6, "6\n");
     myassert(8, "8\n");
     myassert(99, "99\n");
   }

   @Test
   public void testFizzBuzz()
   {
     myassert(35, "35 -> FizzBuzz\n");
     myassert(70, "70 -> FizzBuzz\n");
   }

   public void myassert(int n, String s)
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     FizzBuzz.afficheFizzBuzz(n);
     assertEquals(s, bos.toString());

     System.setOut(originalOut);
   }

   public void mynassert(int n, String s)
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     FizzBuzz.afficheFizzBuzz(n);
     assertNotEquals(s, bos.toString());

     System.setOut(originalOut);
   }
}

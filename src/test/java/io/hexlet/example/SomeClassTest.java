import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import io.hexlet.example.SomeClass;

class SomeClassTest {

   @Test
   public void testSum() {
       var expected = 5;
       var actual = SomeClass.sum(3, 2);
       assertEquals(expected, actual);
   }
}

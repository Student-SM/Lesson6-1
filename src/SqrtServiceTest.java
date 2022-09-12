
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class SqrtServiceTest {

    private AssertJUnit Assertions;

    @Test
    public void test() {

        SqrtService service = new SqrtService();

        int expected = 5;
        int actual = service.calcSqrt(25);

        Assertions.assertEquals(expected, actual);
        
    }
}

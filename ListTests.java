import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {

    @Test
    public void testFilter() {
        string[] input1 = { };
        assertArrayEquals(new string[] { }, ListExamples.filter(input1));
    }
}
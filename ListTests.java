import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

class Checker implements StringChecker {
    @Override
    public boolean checkString(String s) {
        return s.contains("h");
    }
    
}
public class ListTests {

    @Test
    public void testFilter() {
        StringChecker sc = new Checker();
        List<String> input1 = new ArrayList<>();
        input1.add("hello");
        input1.add("world");
        input1.add("hi");
        List<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("hi");
        for(int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), ListExamples.filter(input1, sc).get(i));
        }
        // assertEquals(expected, ListExamples.filter(input1, sc));
    }
    
    // @Test
    // public void testFilterEmpty() {
    //     StringChecker sc = new Checker();
    //     List<String> input1 = new ArrayList<>();
    //     input1.add("world");
    //     List<String> expected = new ArrayList<>();
    //     expected.add("world");
    //     for(int i = 0; i < expected.size(); i++) {
    //         assertEquals(input1.get(i), ListExamples.filter(input1, sc).get(i));
    //     }
        // StringChecker sc = new Checker();
        // List<String> input1 = new ArrayList<>();
        // input1.add("world");
        // List<String> expected = new ArrayList<>();
        // expected.add("");
        // assertArrayEquals(expected.toArray(), ListExamples.filter(input1, sc).toArray());
    // }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("g");
        input1.add("e");
        List<String> input2 = new ArrayList<>();
        input2.add("r");
        input2.add("b");
        List<String> expected = new ArrayList<>();
        expected.add("b");
        expected.add("e");
        expected.add("g");
        expected.add("r");
        for(int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), ListExamples.merge(input1, input2).get(i));
        }
    }
}
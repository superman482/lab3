import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  
  @Test
  public void testReverseInPlace1() {
    int[] input1 = { 1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    System.out.println("(" + input1 + ")");
    assertArrayEquals(new int[]{ 4, 3, 2, 1}, input1);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 0, 1, 2};
    assertArrayEquals(new int[]{ 2, 1, 0}, ArrayExamples.reversed(input1));
    System.out.println("[" + input1 + "]");
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 1);
  }

  @Test
  public void testAverageWithoutLowestOneElement() {
    double[] input1 = { 3.0 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 1);
  }

  @Test
  public void testAverageWithoutLowestManyElement() {
    double[] input1 = { 1.5, 2.5, 3.5, 4.5};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 5);
  }

  @Test
  public void testAverageWithoutLowestDuplicate() {
    double[] input1 = { 2.2, 2.2, 2.2};
    assertEquals(2.2, ArrayExamples.averageWithoutLowest(input1), 5);
  }
}

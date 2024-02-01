import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
@Test
 public void testReversed2() {
   int[] input1 = {1,2,3};
   assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
 }
 @Test
 public void testReversed3() {
   int[] input1 = {2,2,2};
   assertArrayEquals(new int[]{2,2,2}, ArrayExamples.reversed(input1));
 }
 @Test
 public void testReversed4() {
   int[] input1 = {5};
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{5}, ArrayExamples.reversed(input1));
 }
 @Test
 public void reverseInPlace2() {
   int[] input1 = {1,2,3};
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
 }
 @Test
 public void reverseInPlace3() {
   int[] input1 = {2,2,2};
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{2,2,2}, ArrayExamples.reversed(input1));
 }
 @Test
 public void reverseInPlace4() {
   int[] input1 = {5};
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{5}, ArrayExamples.reversed(input1));
 }

}

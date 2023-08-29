import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.example.BinarySearcher.*;

public class BinarySearcherTest {
    private static int[] array;

    @BeforeAll
    public static void initialise() {
        array = new int[] {-6, -4, -1, 0, 3, 4, 7, 8, 12, 19, 24};
    }

    @Test
    public void testIterativeBinarySearch() {
        int index = 0;
        for (int number : array) {
            assertEquals(iterativeBinarySearch(array, number), index);
            index++;
        }
    }

    @Test
    public void testRecursiveBinarySearch() {
        int index = 0;
        for (int number : array) {
            assertEquals(recursiveBinarySearch(array, number), index);
            index++;
        }
    }
}

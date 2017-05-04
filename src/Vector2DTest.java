import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector2DTest {

    @Test
    public void testAdd() {
        Vector2D vec1 = new Vector2D(5, 3);
        Vector2D vec2 = new Vector2D(4, 8);
        Vector2D expected = new Vector2D(9, 11);
        Vector2D actual = vec1.add(vec2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        Vector2D vec1 = new Vector2D(5, 11);
        Vector2D vec2 = new Vector2D(6, 4);
        Vector2D expected = new Vector2D(-1, 7);
        Vector2D actual = vec1.subtract(vec2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        Vector2D vec1 = new Vector2D(3, 12);
        int value = 7;
        Vector2D expected = new Vector2D(21, 84);
        Vector2D actual = vec1.multiply(value);
        assertEquals(expected, actual);
    }
}
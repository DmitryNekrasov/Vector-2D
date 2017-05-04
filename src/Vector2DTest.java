import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    private static final double DELTA = 1e-11;

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

    @Test
    public void testDotProduct() {
        Vector2D vec1 = new Vector2D(4, 8);
        Vector2D vec2 = new Vector2D(3, 11);
        int expected = 100;
        int actual = vec1.dotProduct(vec2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCrossProduct() {
        Vector2D vec1 = new Vector2D(-5, 4);
        Vector2D vec2 = new Vector2D(8, 15);
        int expected = -107;
        int actual = vec1.crossProduct(vec2);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsOrthogonalTrue() {
        Vector2D vec1 = new Vector2D(3, 1);
        Vector2D vec2 = new Vector2D(-2, 6);
        assertTrue(vec1.isOrthogonal(vec2));
    }

    @Test
    public void testIsOrthogonalFalse() {
        Vector2D vec1 = new Vector2D(3, -5);
        Vector2D vec2 = new Vector2D(5, 4);
        assertFalse(vec1.isOrthogonal(vec2));
    }

    @Test
    public void testIsCollinearTrue() {
        Vector2D vec1 = new Vector2D(2, 5);
        Vector2D vec2 = new Vector2D(-6, -15);
        assertTrue(vec1.isCollinear(vec2));
    }

    @Test
    public void testIsCollinearFalse() {
        Vector2D vec1 = new Vector2D(-4, 3);
        Vector2D vec2 = new Vector2D(4, 3);
        assertFalse(vec1.isCollinear(vec2));
    }

    @Test
    public void testLength() {
        Vector2D vec = new Vector2D(3, 14);
        double expected = 14.317821063276353;
        double actual = vec.length();
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testDistance() {
        Vector2D vec1 = new Vector2D(3, 2);
        Vector2D vec2 = new Vector2D(-1, -1);
        double expected = 5.0;
        double actual = vec1.distance(vec2);
        assertEquals(expected, actual, DELTA);
    }
}
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
}
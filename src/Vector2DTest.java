import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    public void testFindDuplicatesHasDuplicates() {
        List<Vector2D> list = new LinkedList<>();

        list.add(new Vector2D(75, 92));
        list.add(new Vector2D(42, 51));
        list.add(new Vector2D(5, 20));
        list.add(new Vector2D());
        list.add(new Vector2D(2, 9));
        list.add(new Vector2D(71, 92));
        list.add(new Vector2D(75, 92));
        list.add(new Vector2D(73, 38));
        list.add(new Vector2D(47, 32));
        list.add(new Vector2D(5, 20));
        list.add(new Vector2D(75, 92));
        list.add(new Vector2D());
        list.add(new Vector2D(47, 32));
        list.add(new Vector2D(75, 92));
        list.add(new Vector2D(0, 0));

        Map<Vector2D, Integer> expected = new HashMap<>();
        expected.put(new Vector2D(47, 32), 2);
        expected.put(new Vector2D(75, 92), 4);
        expected.put(new Vector2D(5, 20), 2);
        expected.put(new Vector2D(), 3);

        Map<Vector2D, Integer> actual = Vector2D.findDuplicates(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindDuplicatesDoesNotHaveDuplicates() {
        List<Vector2D> list = new ArrayList<>();

        list.add(new Vector2D(42, 76));
        list.add(new Vector2D(71, 58));
        list.add(new Vector2D(1, 99));
        list.add(new Vector2D(76, 70));
        list.add(new Vector2D(16, 92));
        list.add(new Vector2D(59, 30));
        list.add(new Vector2D(99, 41));
        list.add(new Vector2D(95, 52));
        list.add(new Vector2D(91, 10));
        list.add(new Vector2D(17, 9));
        list.add(new Vector2D());

        Map<Vector2D, Integer> expected = new HashMap<>();
        Map<Vector2D, Integer> actual = Vector2D.findDuplicates(list);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindDuplicatesSet() {
        Set<Vector2D> set = new HashSet<>();

        set.add(new Vector2D());
        set.add(new Vector2D(50, 1));
        set.add(new Vector2D(16, 89));
        set.add(new Vector2D(94, 1));
        set.add(new Vector2D(16, 89));
        set.add(new Vector2D(54, 78));
        set.add(new Vector2D(50, 1));
        set.add(new Vector2D());
        set.add(new Vector2D(24, 39));
        set.add(new Vector2D(32, 84));
        set.add(new Vector2D(33, 64));
        set.add(new Vector2D(24, 39));
        set.add(new Vector2D(50, 1));
        set.add(new Vector2D());

        Map<Vector2D, Integer> expected = new HashMap<>();
        Map<Vector2D, Integer> actual = Vector2D.findDuplicates(set);

        assertEquals(expected, actual);
    }
}
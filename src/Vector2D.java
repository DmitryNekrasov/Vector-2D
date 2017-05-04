import java.util.*;

public class Vector2D {

    private final int x;
    private final int y;

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Vector2D add(Vector2D vec) {
        return new Vector2D(x + vec.x, y + vec.y);
    }

    public Vector2D subtract(Vector2D vec) {
        return new Vector2D(x - vec.x, y - vec.y);
    }

    public Vector2D multiply(int val) {
        return new Vector2D(x * val, y * val);
    }

    public int dotProduct(Vector2D vec) {
        return x * vec.x + y * vec.y;
    }

    public int crossProduct(Vector2D vec) {
        return x * vec.y - vec.x * y;
    }

    public boolean isOrthogonal(Vector2D vec) {
        return dotProduct(vec) == 0;
    }

    public boolean isColinear(Vector2D vec) {
        return crossProduct(vec) == 0;
    }

    public double length() {
        return Math.sqrt(sqr(x) + sqr(y));
    }

    public double distance(Vector2D vec) {
        return Math.sqrt(sqr(x - vec.x) + sqr(y - vec.y));
    }

    private static int sqr(int val) {
        return val * val;
    }

    public static Map<Vector2D, Integer> findDuplicates(Collection<Vector2D> vectors) {
        Set<Vector2D> set = new HashSet<>();
        Map<Vector2D, Integer> duplicates = new HashMap<>();
        for (Vector2D vector : vectors) {
            if (set.contains(vector)) {
                int lastCount = duplicates.getOrDefault(vector, 1);
                duplicates.put(vector, lastCount + 1);
            } else {
                set.add(vector);
            }
        }
        return duplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Vector2D)) {
            return false;
        }
        Vector2D vec = (Vector2D) o;
        return x == vec.x && y == vec.y;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(x) ^ Integer.hashCode(y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

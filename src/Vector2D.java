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
        int newX = x + vec.x;
        int newY = y + vec.y;
        return new Vector2D(newX, newY);
    }

    public Vector2D multiply(int val) {
        int newX = x * val;
        int nexY = y * val;
        return new Vector2D(newX, nexY);
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

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

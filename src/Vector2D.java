public class Vector2D {

    private final int x;
    private final int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

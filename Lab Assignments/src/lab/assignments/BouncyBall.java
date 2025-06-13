package lab.assignments;

public class BouncyBall {
    private int x;
    private int y;
    private String color;

    public BouncyBall(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Getters and setters
    public int getX() { return x; }
    public int getY() { return y; }
    public String getColor() { return color; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setColor(String color) { this.color = color; }

    // Simple move method (you can enhance this)
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Collision behavior based on colors
    public void collide(BouncyBall other) {
        if (this.color.equals("red") && other.color.equals("blue")) {
            this.color = "blue";
        } else if (this.color.equals("green") && other.color.equals("red")) {
            this.color = "red";
        }
        // Other cases no change
    }

    @Override
    public String toString() {
        return "BouncyBall at (" + x + "," + y + ") color: " + color;
    }
}

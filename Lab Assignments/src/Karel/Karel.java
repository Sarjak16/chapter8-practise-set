package lab.assignments;

public class Karel {
    private int xPos;
    private int yPos;
    private String direction;  // "north", "south", "east", "west"

    public Karel() {
        xPos = 0;
        yPos = 0;
        direction = "north";
    }

    public void move() {
        switch (direction) {
            case "north": yPos += 1; break;
            case "south": yPos -= 1; break;
            case "east": xPos += 1; break;
            case "west": xPos -= 1; break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "north": direction = "west"; break;
            case "west": direction = "south"; break;
            case "south": direction = "east"; break;
            case "east": direction = "north"; break;
        }
    }

    public String getPosition() {
        return "(" + xPos + ", " + yPos + ") facing " + direction;
    }
}

class Spacecraft {
    private int x;
    private int y;
    private int z;
    private String direction;

    public Spacecraft(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
            case "Up":
                z++;
                break;
            case "Down":
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "E":
                x--;
                break;
            case "W":
                x++;
                break;
            case "Up":
                z--;
                break;
            case "Down":
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "S":
                direction = "W";
                break;
            case "E":
                direction = "S";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void turnUp() {
        if (direction.equals("N")) {
            direction = "Up";
        } else if (direction.equals("S")) {
            direction = "Down";
        }
    }

    public void turnDown() {
        if (direction.equals("Up")) {
            direction = "N";
        } else if (direction.equals("Down")) {
            direction = "S";
        }
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            switch (command) {
                case "f":
                    moveForward();
                    break;
                case "b":
                    moveBackward();
                    break;
                case "l":
                    turnLeft();
                    break;
                case "r":
                    turnRight();
                    break;
                case "u":
                    turnUp();
                    break;
                case "d":
                    turnDown();
                    break;
            }
        }
    }

    public void printPositionAndDirection() {
        System.out.println("Final position: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Final direction: " + direction);
    }
}


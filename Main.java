public class Main {
    public static void main(String[] args) {
        int initialX = 0;
        int initialY = 0;
        int initialZ = 0;
        String initialDirection = "N";
        String[] commands = {"f", "r", "u", "b", "l", "d"};

        Spacecraft spacecraft = new Spacecraft(initialX, initialY, initialZ, initialDirection);
        spacecraft.executeCommands(commands);
        spacecraft.printPositionAndDirection();
    }
}

public class Main {
    public static void main(String[] argv){
        Planet planet = new Planet(20, 20, 0, 0, "Mars");
        Position position = new Position(10, 10);
        Rover rover = new Rover(planet, position, 1, true);
        System.out.println(rover.toString());

        for (int i=0; i< 22; i++) {
            rover.goBackward();
            System.out.println(rover.toString());
        }
        rover.stop();
        rover.goLeft();
        System.out.println(rover.toString());
        rover.goForward();
        System.out.println(rover.toString());
        rover.goRight();
        System.out.println(rover.toString());
    }
}

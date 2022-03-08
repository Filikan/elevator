public class Main extends Elevator{

    public static void main(String[] args) {
        Elevator e1 = new Elevator();

        e1.OpenDoor();
        e1.Check();
        e1.CloseDoor();

        e1.GoUp();
        e1.OpenDoor();
        e1.CloseDoor();
        e1.EmergencyStop();
        capacity = 5;
        e1.Check();
    }
}

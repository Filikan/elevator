public class Elevator {
    public static int capacity=4;
    public int currentFloor=0;
    public int maxFloor=4;
    public int minFloor=0;

    public int GoUp()
    {
        if(currentFloor<maxFloor)
        {
            System.out.println("One floor went up.");
            currentFloor++;
            System.out.println("Current floor:"+currentFloor);
        }
        else if(currentFloor==maxFloor)
        {
            System.out.println("The elevator can not go up!");
            System.out.println("Current floor:"+currentFloor);
        }
        return currentFloor;
    }

    public int GoDown()
    {
        if(currentFloor>maxFloor)
        {
            System.out.println("One floor went down.");
            currentFloor--;
            System.out.println("Current floor:"+currentFloor);
        }
        else if(currentFloor==minFloor)
        {
            System.out.println("The elevator can not go down!\nCurrent floor:"+currentFloor);
        }
        return currentFloor;
    }

    public static void EmergencyStop()
    {
        System.out.println("The elevator is stoped!");
    }

    public static void OpenDoor()
    {
        System.out.println("The door is opened.");
    }

    public static void CloseDoor()
    {
        System.out.println("The door is closed.");;
    }

    public static void Check()
    {
        if(capacity>4)
        {
            System.out.println("Capacity must be 4 people.Elevator can not work!");
        }
        else
        {
            System.out.println("There is no problem.Elevator can work.");
        }
    }
}

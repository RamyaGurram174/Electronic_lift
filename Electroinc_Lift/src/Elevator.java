import java.util.Scanner;

public class Elevator {
	 int currentFloor;

     public Elevator() {
        currentFloor = 1; // Start at the first floor
    }

    public void moveToFloor(int targetFloor) {
        if (targetFloor > 0 && targetFloor <= 10) { // Assuming a building with 10 floors
            System.out.println("Moving from Floor"+currentFloor+"to Floor"+targetFloor);
            currentFloor = targetFloor;
            System.out.println("Arrived at Floor" + currentFloor);
        } 
        
        else {
            System.out.println("Invalid floor number");
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}


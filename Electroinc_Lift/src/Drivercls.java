import java.util.Scanner;

public class Drivercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electronic Elevator!");
        while (true) {
            System.out.println("Current Floor: " + elevator.getCurrentFloor());
            System.out.print("Enter target floor (1-10) or -1 to exit: ");
            int targetFloor = scanner.nextInt();
            
            if (targetFloor == -1) {
                System.out.println("Exiting elevator..Have a nice day");
                break;
            }

            elevator.moveToFloor(targetFloor);
        }

        scanner.close();
    

	}

}










package devicerepair;

import java.util.Scanner;

public class DeviceRepair {

    private static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        Device myNewDevice = new Device("12345", "Lenovo 3", "Alfie", "smashed screen", "not started", 1);
        System.out.println(myNewDevice.toString());
        System.out.println(myNewDevice.getOwner());

        String thing = myNewDevice.toString();
        String[] Device = thing.split(", ");
        System.out.println(Device[2]);

    }

    public static void mainMenu() {
        while (true) {
            System.out.println("Please select an option");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("You chose 1");
                    break;
                case 2:
                    System.out.println("You chose 2");
                    break;
                case 3:
                    System.out.println("You chose 3");
            }
           
            
        }
    }

}

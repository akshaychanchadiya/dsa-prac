package Practise;
import java.util.*;

public class HotelManagementCode {


        static String[][] hotelRooms = new String[10][26]; // 10 floors, 26 rooms per floor
        static int totalCoins = 0;
        static int activeBookings = 0;

        public static void main(String[] args) {
            // Scanner for user input
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            // Initialize the hotelRooms array with null values (empty rooms)
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 26; j++) {
                    hotelRooms[i][j] = null; // Room is empty
                }
            }

            // Main loop to handle menu-driven user input
            while (running) {
                System.out.println("\nHotel Management System:");
                System.out.println("1. Book a Room");
                System.out.println("2. Checkout a Room");
                System.out.println("3. Print All Rooms");
                System.out.println("4. Show Total Coins");
                System.out.println("5. Show Active Bookings");
                System.out.println("6. Show Booked Rooms with Customers");
                System.out.println("7. Check Room Availability");
                System.out.println("8. Get Customer Name by Room ID");
                System.out.println("9. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt(); // 1,2,3,4,5,....9

                // Process user's menu choice using switch-case
                switch (choice) {
                    case 1: // my choice is 1
                        bookRoom(scanner); // book a room function activates
                        break;
                    case 2: // my choice is 2
                        checkoutRoom(scanner); // checkout a room function activates
                        break;
                    case 3:
                        printRooms();
                        break;
                    case 4:
                        System.out.println("Total Coins Collected: " + totalCoins);
                        break;
                    case 5:
                        System.out.println("Active Bookings: " + activeBookings);
                        break;
                    case 6:
                        printBookedRooms();
                        break;
                    case 7:
                        checkRoomAvailability(scanner);
                        break;
                    case 8:
                        getCustomerName(scanner);
                        break;
                    case 9:
                        running = false; // turning the variable boolean 'running' to 'false'
                        System.out.println("Exiting... Thank you!");
                        break;
                    default: // if the user enters a number other than 1,2,3,4,5,6,7,8,9
                        System.out.println("Invalid choice. Try again.");
                }
            }
            scanner.close(); // Close the scanner when done
        }

        // Method to book a room (fill in details for booking)
        public static void bookRoom(Scanner scanner) {
            // Prompt user for room ID and customer name, then process booking
            System.out.println("Enter room ID: ");
            String roomId = scanner.next();
            System.out.println("Enter customer name: ");
            String customerName = scanner.next();

            int floor = roomId.charAt(0) - '0'; // Extract floor number
            int room = roomId.charAt(1) - 'A';

            if (hotelRooms[floor][room] == null) {
                hotelRooms[floor][room] = customerName;
                System.out.println("Room booked successfully!");
                totalCoins++;
                activeBookings++;
            } else {
                System.out.println("Room is already booked.");
            }
        }

        // Method to checkout a room (remove customer from room and update status)
        public static void checkoutRoom(Scanner scanner) {
            // Prompt user for room ID to checkout, update room status to vacant
            System.out.println("Enter room ID: ");
            String roomId = scanner.next();

            int floor = roomId.charAt(0) - '0'; // Extract floor number
            int room = roomId.charAt(1) - 'A';

            if (hotelRooms[floor][room] != null) {
                hotelRooms[floor][room] = null;
                System.out.println("Room checked out successfully!");
                activeBookings--;
            } else {
                System.out.println("Room is already vacant.");
            }
        }

        // Method to print all rooms (show vacant and booked rooms)
        public static void printRooms() {
            // Print the status of all rooms in the hotel
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 26; j++) {
                    // conversion from i,j index values to room id like 1A, 1B, 1C, 2A, 2B, 2C, etc.
                    String roomId = i + "" + (char) ('A' + j);
                    if (hotelRooms[i][j] == null) {
                        System.out.println(roomId + " is vacant.");
                    } else {
                        System.out.println(roomId + " is booked.");
                    }
                }
            }
        }

        // Method to print all booked rooms with customer names
        public static void printBookedRooms() {
            // Print rooms that are booked and the customers' names
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 26; j++) {
                    String roomId = i + "" + (char) ('A' + j);
                    if (hotelRooms[i][j] != null) {
                        System.out.println(roomId + " is booked by " + hotelRooms[i][j]);
                    }
                }
            }
        }

        // Method to check room availability
        public static void checkRoomAvailability(Scanner scanner) {
            // Check if the selected room is available or already booked
            System.out.println("Enter room ID: ");
            String roomId = scanner.next();

            int floor = roomId.charAt(0) - '0'; // Extract floor number
            int room = roomId.charAt(1) - 'A';

            if (hotelRooms[floor][room] == null) {
                System.out.println("Room is available.");
            } else {
                System.out.println("Room is already booked.");
            }

        }

        // Method to get customer name by room ID
        public static void getCustomerName(Scanner scanner) {
            // Retrieve and display the customer name for the selected room ID
            System.out.println("Enter room ID: ");
            String roomId = scanner.next();
            int floor = roomId.charAt(0) - '0'; // Extract floor number
            int room = roomId.charAt(1) - 'A';
            if (hotelRooms[floor][room] != null) {
                System.out.println("Customer name: " + hotelRooms[floor][room]);
            } else {
                System.out.println("Room is vacant.");
            }

        }
    }



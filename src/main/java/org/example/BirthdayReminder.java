package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class BirthdayReminder {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Map<String, String> friends = new HashMap<>();
            int count = 0;

            // Input loop for names and birthdates
            while (count < 10) {
                System.out.print("Enter friend name (or ZZZ to finish): ");
                String name = input.nextLine().trim();

                if (name.equalsIgnoreCase("ZZZ")) {
                    break;
                }

                if (friends.containsKey(name)) {
                    System.out.println("Name already entered. Please enter a different name.");
                    continue;
                }

                System.out.print("Enter birthdate for " + name + " (e.g., MM/DD/YYYY): ");
                String birthdate = input.nextLine().trim();

                friends.put(name, birthdate);
                count++;
            }

            // Display count and names
            System.out.println("\nTotal names entered: " + friends.size());
            System.out.println("Names entered:");
            for (String name : friends.keySet()) {
                System.out.println(name);
            }

            // Loop to display birthdates based on user input
            while (true) {
                System.out.print("\nEnter a name to get the birthdate (or 222 to exit): ");
                String query = input.nextLine().trim();

                if (query.equals("222")) {
                    System.out.println("Exiting...");
                    break;
                }

                String birthdate = friends.get(query);
                if (birthdate != null) {
                    System.out.println("Birthdate for " + query + ": " + birthdate);
                } else {
                    System.out.println("Error: Name not found.");
                }
            }

            input.close();
        }
    }



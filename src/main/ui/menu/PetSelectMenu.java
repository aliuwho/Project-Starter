//package ui.menu;
//
//import model.Pet;
//import persistence.Saveable;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// * represents a menu for selecting a pet to interact with
// */
//public class PetSelectMenu extends Menu {
//    private final ArrayList<Pet> pets;
//    private Pet pet;
////    private final Saveable saveable;
//
//    // EFFECTS: runs pet select menu for a user without any pets
//    public PetSelectMenu(Saveable saveable, Scanner input, String username) {
//        super(input, "Pet Select Menu");
//        this.saveable = saveable;
//        this.pets = saveable.getPets();
//        this.input = input;
//        this.username = username;
//    }
//
//    // EFFECTS: displays pets (if any)
//    @Override
//    public void displayMenu() {
//        super.displayMenu();
//        System.out.println("\t0 -> Get another pet");
//        if (pets.size() != 0) {
//            for (int i = 0; i < pets.size(); i++) {
//                System.out.println("\t" + (i + 1) + " -> Select " + pets.get(i).getName());
//            }
//        } else {
//            System.out.println("You need to get a pet!");
//        }
//        System.out.println("\tq -> Return to main menu");
//    }
//
//    // MODIFIES: this
//    // EFFECTS: allows user to select from existing pets or get a new one
//    @Override
//    public void processCommand(String command) {
//        if (command.equals("0")) {
//            NewPetMenu newPetMenu = new NewPetMenu(input, username);
//            newPetMenu.runApp();
//            pets.add(newPetMenu.getPet());
//        } else {
//            try {
//                int i = Integer.parseInt(command) - 1;
//                pet = pets.get(i);
//                PetRoomMenu prm = new PetRoomMenu(input, username, saveable, pet);
//                prm.runApp();
//
//            } catch (NumberFormatException e) {
//                System.out.println("That's not one of the options!");
//            }
//        }
//        displayMenu();
//    }
//
//    // EFFECTS: bids user farewell
//    @Override
//    protected void farewell() {
//        if (pet != null) {
//            System.out.println("You have selected your " + pet.getSpecies() + " " + pet.getName() + "!");
//        } else {
//            System.out.println("Exiting...");
//        }
//    }
//}

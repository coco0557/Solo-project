// add the Scanner and ArrayList utilities
import java.util.ArrayList;
import java.util.Scanner;

// create a main class to launch the inventory system
public class MainApp {

    public static void main(String[] args) {

        // create Scanner object to collect user input
        Scanner scanner = new Scanner(System.in);

        // initialise the inventory manager
        InventoryManager manager = new InventoryManager();

        // ======================
        // create and add each stock category
        // ======================

        // Meat & Seafood Category
        ArrayList<Item> meatList = new ArrayList<>();
        meatList.add(new Item("Chicken breast (TDH)", 3));
        meatList.add(new Item("Cooked chicken (C Vale)", 2));
        meatList.add(new Item("Spare rib meat (Ho Wan)", 1));
        meatList.add(new Item("Pork neck (13.6kg)", 3));
        meatList.add(new Item("Duck 2.6 county", 2));
        meatList.add(new Item("Cooked duck breast", 2));
        meatList.add(new Item("King prawn (31/40)", 3));
        meatList.add(new Item("Squid tubes", 2));
        meatList.add(new Item("Crabmeat", 1));
        meatList.add(new Item("Shrimp 100/200", 2));
        meatList.add(new Item("Scallop", 2));
        manager.addCategory(new MeatAndSeafood(meatList)); // add category to manager

        // Vegetables & Fresh Produce Category
        ArrayList<Item> vegList = new ArrayList<>();
        vegList.add(new Item("Pak choi", 3));
        vegList.add(new Item("Baby corn cob", 2));
        vegList.add(new Item("Spring onion (Big head)", 1));
        vegList.add(new Item("Bamboo strip small thin", 2));
        vegList.add(new Item("Beansprouts", 3));
        vegList.add(new Item("Garlic flake", 2));
        vegList.add(new Item("Ginger", 3));
        vegList.add(new Item("Peas", 1));
        manager.addCategory(new VegandFresh(vegList));

        // Prepared Frozen Items Category
        ArrayList<Item> frozenList = new ArrayList<>();
        frozenList.add(new Item("Pork gyoza", 2));
        frozenList.add(new Item("Veg gyoza", 2));
        frozenList.add(new Item("Chicken gyoza", 1));
        frozenList.add(new Item("Veg spring roll", 3));
        frozenList.add(new Item("Wonton pastry", 1));
        frozenList.add(new Item("Breaded torpedo KP", 2));
        frozenList.add(new Item("Duck skin (pancake)", 2));
        manager.addCategory(new preparedFrozenItems(frozenList));

        // Noodles & Rice Category
        ArrayList<Item> noodleList = new ArrayList<>();
        noodleList.add(new Item("Rice", 4));
        noodleList.add(new Item("Noodle", 3));
        noodleList.add(new Item("Udon", 2));
        noodleList.add(new Item("Rice sticks", 2));
        noodleList.add(new Item("Vietnamese rice paper", 1));
        noodleList.add(new Item("Rice stick ban pho", 3));
        manager.addCategory(new noodlesAndRice(noodleList));

        // Canned & Jarred Goods Category
        ArrayList<Item> cannedList = new ArrayList<>();
        cannedList.add(new Item("Chinese shredded radish (TIN)", 2));
        cannedList.add(new Item("Cream style corn", 1));
        cannedList.add(new Item("Lychees", 2));
        cannedList.add(new Item("Pineapple pieces (L)", 2));
        cannedList.add(new Item("Water chestnut", 3));
        cannedList.add(new Item("½ straw mushrooms", 2));
        cannedList.add(new Item("Poku mushrooms", 3));
        cannedList.add(new Item("Group fried fish", 2));
        manager.addCategory(new CannedAndJarred(cannedList));

        // Spices & Seasonings Category
        ArrayList<Item> spiceList = new ArrayList<>();
        spiceList.add(new Item("MSG (L)", 2));
        spiceList.add(new Item("Bay Leaves", 1));
        spiceList.add(new Item("Ground white pepper", 3));
        spiceList.add(new Item("White sugar", 1));
        spiceList.add(new Item("Salt (L)", 1));
        spiceList.add(new Item("Yellow ginger powder", 3));
        spiceList.add(new Item("Curry powder (10kg)", 2));
        spiceList.add(new Item("Red Curry Paste", 2));
        spiceList.add(new Item("Green curry paste", 2));
        spiceList.add(new Item("Wah loong mixed spice", 3));
        spiceList.add(new Item("Food soda", 2));
        spiceList.add(new Item("Star anise", 3));
        spiceList.add(new Item("Cinnamon sticks", 2));
        manager.addCategory(new spiceAndSeasonings(spiceList));

        // ================
        // Main Menu Loop
        // ================
        while (true) {
            System.out.println("\n=== Inventory System Menu ===");
            System.out.println("1. Display all stock");
            System.out.println("2. Search for item");
            System.out.println("3. Update quantity");
            System.out.println("4. Check low stock");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // take input from user
            scanner.nextLine(); // consume leftover newline

            if (choice == 1) {
                manager.displayAllStock(); // show everything
            } else if (choice == 2) {
                System.out.print("Enter item name to search: ");
                String itemName = scanner.nextLine();
                manager.searchItem(itemName);
            } else if (choice == 3) {
                System.out.print("Enter item name to update: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter new quantity: ");
                int quantity = scanner.nextInt();
                manager.updateQuantity(itemName, quantity);
            } else if (choice == 4) {
                System.out.print("Enter threshold value: ");
                int threshold = scanner.nextInt();
                manager.checkLowStock(threshold);
            } else if (choice == 5) {
                System.out.println("Exiting..."); // end program
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close(); // close scanner after use
    }
}

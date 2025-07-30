import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // === Create and add Meat & Seafood category ===
        ArrayList<Item> meatList = new ArrayList<>();
        meatList.add(new Item("Chicken breast (TDH)", 3));
        meatList.add(new Item("Cooked chicken (C Vale)", 2));
        meatList.add(new Item("Spare rib meat (Ho Wan)", 4));
        meatList.add(new Item("Pork neck (13.6kg)", 1));
        meatList.add(new Item("Duck 2.6 county", 2));
        meatList.add(new Item("Cooked duck breast", 3));
        meatList.add(new Item("King prawn (31/40)", 5));
        meatList.add(new Item("Squid tubes", 2));
        meatList.add(new Item("Crabmeat", 3));
        meatList.add(new Item("Shrimp 100/200", 1));
        meatList.add(new Item("Scallop", 2));
        manager.addCategory(new MeatAndSeafood(meatList));

        // === Create and add Vegetables & Fresh Produce category ===
        ArrayList<Item> vegList = new ArrayList<>();
        vegList.add(new Item("Pak choi", 3));
        vegList.add(new Item("Baby corn cob", 2));
        vegList.add(new Item("Spring onion (Big head)", 4));
        vegList.add(new Item("Bamboo strip small thin", 1));
        vegList.add(new Item("Beansprouts", 2));
        vegList.add(new Item("Garlic flake", 3));
        vegList.add(new Item("Ginger", 4));
        vegList.add(new Item("Peas", 2));
        manager.addCategory(new VegandFresh(vegList));

        // === Create and add Prepared Frozen Items category ===
        ArrayList<Item> frozenList = new ArrayList<>();
        frozenList.add(new Item("Pork gyoza", 2));
        frozenList.add(new Item("Veg gyoza", 3));
        frozenList.add(new Item("Chicken gyoza", 2));
        frozenList.add(new Item("Veg spring roll", 4));
        frozenList.add(new Item("Wonton pastry", 1));
        frozenList.add(new Item("Breaded torpedo KP", 2));
        frozenList.add(new Item("Duck skin (pancake)", 2));
        manager.addCategory(new preparedFrozenItems(frozenList));

        // === Create and add Noodles & Rice category ===
        ArrayList<Item> noodleList = new ArrayList<>();
        noodleList.add(new Item("Rice", 4));
        noodleList.add(new Item("Noodle", 3));
        noodleList.add(new Item("Udon", 2));
        noodleList.add(new Item("Rice sticks", 2));
        noodleList.add(new Item("Vietnamese rice paper", 1));
        noodleList.add(new Item("Rice stick ban pho", 2));
        manager.addCategory(new noodlesAndRice(noodleList));

        // === Create and add Canned & Jarred Goods category ===
        ArrayList<Item> cannedList = new ArrayList<>();
        cannedList.add(new Item("Chinese shredded radish (TIN)", 2));
        cannedList.add(new Item("Cream style corn", 2));
        cannedList.add(new Item("Lychees", 1));
        cannedList.add(new Item("Pineapple pieces (L)", 2));
        cannedList.add(new Item("Water chestnut", 3));
        cannedList.add(new Item("1/2 straw mushrooms", 2));
        cannedList.add(new Item("Poku mushrooms", 3));
        cannedList.add(new Item("Group fried fish", 2));
        manager.addCategory(new CannedAndJarred(cannedList));

        // === Create and add Spices & Seasonings category ===
        ArrayList<Item> spiceList = new ArrayList<>();
        spiceList.add(new Item("MSG (L)", 2));
        spiceList.add(new Item("Bay Leaves", 1));
        spiceList.add(new Item("Ground white pepper", 3));
        spiceList.add(new Item("White sugar", 1));
        spiceList.add(new Item("Salt (L)", 1));
        spiceList.add(new Item("Yellow ginger powder", 3));
        spiceList.add(new Item("Curry powder (10kg)", 2));
        spiceList.add(new Item("Red Curry Paste", 2));
        spiceList.add(new Item("Green Curry Paste", 2));
        spiceList.add(new Item("Wah loong mixed spice", 3));
        spiceList.add(new Item("Food soda", 2));
        spiceList.add(new Item("Star anise", 3));
        spiceList.add(new Item("Cinnamon sticks", 2));
        manager.addCategory(new spiceAndSeasonings(spiceList));

        // === Sample interaction ===
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display All Stock");
            System.out.println("2. Search for Item");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. Show Low Stock Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manager.displayAllStock();
                    break;
                case 2:
                    System.out.print("Enter item name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchItem(searchName);
                    break;
                case 3:
                    System.out.print("Enter item name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQty = scanner.nextInt();
                    manager.updateQuantity(updateName, newQty);
                    break;
                case 4:
                    manager.checkLowStock(1);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

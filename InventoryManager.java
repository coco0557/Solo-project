import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<StockCategory> categories;

    public InventoryManager() {
        categories = new ArrayList<>();
    }

    public void addCategory(StockCategory category) {
        categories.add(category);
    }
  // create a method to search for an item by name
public void searchItem(String itemName) {
    
    // loop through each stock category in the inventory
    for (StockCategory category : categories) {
        
        // loop through all the items in the current category
        for (Item item : category.getItems()) {
            
            // check if the item's name matches the one we're searching for (ignores upper/lowercase)
            if (item.getName().equalsIgnoreCase(itemName)) {
                
                // get the category name using class name (e.g. spiceAndSeasonings)
                String categoryName = category.getClass().getSimpleName();
                
                // print out the item details and the category it belongs to
                System.out.println("Found: " + item.getName() + " (Qty: " + item.getQuantity() + ") in " + categoryName);
                
                // exit the method once the item is found
                return;
            }
        }
    }
    
    // if the item wasn't found in any category, print this message
    System.out.println("Item not found: " + itemName);
}

  // create a method to update the quantity of an item by name
public void updateQuantity(String itemName, int newQuantity) {
    
    // loop through each category in the inventory
    for (StockCategory category : categories) {
        
        // loop through each item in the current category
        for (Item item : category.getItems()) {
            
            // check if the item name matches the one we want to update
            if (item.getName().equalsIgnoreCase(itemName)) {
                
                // update the quantity of the item
                item.setQuantity(newQuantity);
                
                // confirm the update in console
                System.out.println("Updated: " + item.getName() + " to quantity " + newQuantity);
                
                // stop searching once the item has been found and updated
                return;
            }
        }
    }
    
    // if item isn't found in any category, print this message
    System.out.println("Item not found: " + itemName);
}

// create a method to check and display all items with low stock (less than 2)
public void checkLowStock() {
    
    // notify that this is the low stock check
    System.out.println("=== Low Stock Items (< 2) ===");

    // loop through each category in the inventory
    for (StockCategory category : categories) {
        
        // get the category name from the class
        String categoryName = category.getClass().getSimpleName();
        
        // loop through each item in the current category
        for (Item item : category.getItems()) {
            
            // if the quantity is less than 2, display it as low stock
            if (item.getQuantity() < 2) {
                System.out.println("- " + item.getName() + " (Qty: " + item.getQuantity() + ") in " + categoryName);
            }
        }
    }
}


    public void displayAllStock() {
        for (StockCategory category : categories) {
            // Use class name as category name
            String categoryName = category.getClass().getSimpleName();
            category.displayItems(categoryName);
            System.out.println(); // adds a line break
        }
    }
}

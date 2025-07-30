import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<StockCategory> categories;

    public InventoryManager() {
        categories = new ArrayList<>();
    }

    public void addCategory(StockCategory category) {
        categories.add(category);
    }
    //add item search
    public void searchItem(String itemName) {
    for (StockCategory category : categories) {
        for (Item item : category.getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                String categoryName = category.getClass().getSimpleName();
                System.out.println("Found: " + item.getName() + " (Qty: " + item.getQuantity() + ") in " + categoryName);
                return;
            }
        }
    }
    }
    // add update quantity
   public void updateQuantity(String itemName, int newQuantity) {
    for (StockCategory category : categories) {
        for (Item item : category.getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(newQuantity);
                System.out.println("Updated " + item.getName() + " to quantity: " + newQuantity);
                return;
            }
        }
    }
    System.out.println("Item not found: " + itemName);
}
//add low stock warning
    
public void checkLowStock(int threshold) {
    System.out.println("=== Low Stock Alert (below " + threshold + ") ===");
    for (StockCategory category : categories) {
        for (Item item : category.getItems()) {
            if (item.getQuantity() <= threshold) {
                System.out.println("- " + item.getName() + " (Qty: " + item.getQuantity() + ")");
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

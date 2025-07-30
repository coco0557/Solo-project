import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<StockCategory> categories;

    public InventoryManager() {
        categories = new ArrayList<>();
    }

    public void addCategory(StockCategory category) {
        categories.add(category);
    }
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
    System.out.println("Item not found: " + itemName);
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

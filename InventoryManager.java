import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<StockCategory> categories;

    public InventoryManager() {
        categories = new ArrayList<>();
    }

    public void addCategory(StockCategory category) {
        categories.add(category);
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

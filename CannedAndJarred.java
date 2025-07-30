import java.util.ArrayList;
public class CannedAndJarred {
    
    private ArrayList<String> items;

    public CannedAndJarred(ArrayList<String> items) {
        this.items = items;
    }
    
    public void addItem(String item){
        items.add(item);
    }
    public void displayItems() {
        System.out.println("===Canned and Jarred Goods===");
for (String item : items) {
    System.out.println("- " + item);
}
    }
    public ArrayList<String> getItems() {
        return items;
    }
    public static void main(String[] args) {
        ArrayList<String> goodsList = new ArrayList<>();
        goodsList.add("Chinese Shredded Radish");
        goodsList.add("Cream Style Corn");
        goodsList.add("Lychees");
        goodsList.add("Pineapple Pieces(L)");
        goodsList.add("Water Chestnut");
        goodsList.add("1/2 Straw Mushrooms");
        goodsList.add("Poku Mushrooms");
        goodsList.add("Ground Fried Fish");
        CannedAndJarred restock = new CannedAndJarred(goodsList);
        restock.displayItems();
    }
    
}


// new update for the code - i have added the StockCategory and InventoryManager:
// here is the updated code using the both of them

import java.util.ArrayList;
public class CannedAndJarred extends StockCategory {
    
    public CannedAndJarred(ArrayList<String> items) {
        super(items); 
    }
  
    public static void main(String[] args) {
        ArrayList<String> goodsList = new ArrayList<>();
        goodsList.add("Chinese Shredded Radish");
        goodsList.add("Cream Style Corn");
        goodsList.add("Lychees");
        goodsList.add("Pineapple Pieces(L)");
        goodsList.add("Water Chestnut");
        goodsList.add("1/2 Straw Mushrooms");
        goodsList.add("Poku Mushrooms");
        goodsList.add("Ground Fried Fish");
        CannedAndJarred restock = new CannedAndJarred(goodsList);
        
        InventoryManager manager = new InventoryManager();
        manager.addCategory(restock);
        manager.displayAllStock();
    }
    
}

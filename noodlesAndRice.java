import java.util.ArrayList;

public class noodlesAndRice {
    private ArrayList<String> items;
    
    // constructor
    public noodlesAndRice(ArrayList<String> items) {
        this.items = items;
    }
    
    
    public void addItem(String item){ 
        items.add(item);
    }
    public void displayItems() {
        System.out.println("===Noodles And Rice===");
 for (String item : items){
     System.out.println("- " + item);
 }       
    }
    public ArrayList<String> getItems(){
        return items;
    } 
    
    public static void main(String[] args) {
        ArrayList<String>NoodleRiceList = new ArrayList<>();
        NoodleRiceList.add("Rice");
        NoodleRiceList.add("Noodle");
        NoodleRiceList.add("Udon");
        NoodleRiceList.add("Rice Sticks");
        NoodleRiceList.add("Vietnamese rice paper");
        NoodleRiceList.add("Rice stick ban pho");
        noodlesAndRice restock = new noodlesAndRice(NoodleRiceList);
        restock.displayItems();
    }
    
}

// new update for the code - i have added the StockCategory and InventoryManager:
// here is the updated code using the both of them

import java.util.ArrayList;
public class noodlesAndRice extends StockCategory {
    
    public noodlesAndRice(ArrayList<String> items) {
        super(items); 
    }
  
    public static void main(String[] args) {
        ArrayList<String>NoodleRiceList = new ArrayList<>();
        NoodleRiceList.add("Rice");
        NoodleRiceList.add("Noodle");
        NoodleRiceList.add("Udon");
        NoodleRiceList.add("Rice Sticks");
        NoodleRiceList.add("Vietnamese rice paper");
        NoodleRiceList.add("Rice stick ban pho");
        noodlesAndRice restock = new noodlesAndRice(NoodleRiceList);
        
        InventoryManager manager = new InventoryManager();
        manager.addCategory(restock);
        manager.displayAllStock();
    }
    
}

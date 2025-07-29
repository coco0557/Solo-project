import java.util.ArrayList;

public class preparedFrozenItems {
    
    private ArrayList<String> items;

    public preparedFrozenItems(ArrayList<String> items) {
        this.items = items;
    }
    
    public void addItem(String item){
        items.add(item);
    }
    public void displayItems(){
        System.out.println("===Prepared frozen items===");
for (String item : items) {
       System.out.println("- " + item);
}
    }
  public ArrayList<String> getItems() { 
      return items;
  }
    public static void main(String[] args) {
        ArrayList<String>FrozenList = new ArrayList<>();
        FrozenList.add("Pork Gyoza");
        FrozenList.add("Veg Gyoza");
        FrozenList.add("Chicken Gyoza");
        FrozenList.add("Veg spring Roll");
        FrozenList.add("Wonton Pastry");
        FrozenList.add("Breaded Torpedo KP");
        FrozenList.add("Duck Skin (pancake)");
        preparedFrozenItems restock = new preparedFrozenItems(FrozenList);
        restock.displayItems();
        
    }
    
}

Here is the code so far. i have only done the meat and seafood section.
array list was used:


  import java.util.ArrayList;

public class MeatAndSeafood {
    
  private ArrayList<String> items;
  
  //constructor
  public MeatAndSeafood(ArrayList<String> items) {
      this.items = items;
  }
  
  
  public void addItem(String item){
      items.add(item);
  }
  public void displayItems() {
      System.out.println("===Meat and Seafood items===");
for (String item : items) {
    System.out.println("- " + item);
}
  }
  public ArrayList<String> getItems() { 
      return items;
  }
  public static void main(String[] args) {
         ArrayList<String> meatList = new ArrayList<>();
        meatList.add("Chicken breast (TDH)");
        meatList.add("Cooked chicken (C Vale)");
        meatList.add("Spare rib meat (Ho Wan)");
        meatList.add("Pork neck (13.6kg)");
        meatList.add("Duck 2.6 county");
        meatList.add("Cooked duck breast");
        meatList.add("King prawn (31/40)");
        meatList.add("Squid tubes");
        meatList.add("Crabmeat");
        meatList.add("Shrimp 100/200");
        meatList.add("Scallop");
        MeatAndSeafood restock = new MeatAndSeafood(meatList);
        restock.displayItems();
  }
}

OUTPUT:
===Meat and Seafood items===
- Chicken breast (TDH)
- Cooked chicken (C Vale)
- Spare rib meat (Ho Wan)
- Pork neck (13.6kg)
- Duck 2.6 county
- Cooked duck breast
- King prawn (31/40)
- Squid tubes
- Crabmeat
- Shrimp 100/200
- Scallop

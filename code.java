//Initial version of meatvegStock class using hardcoded fields for 11 items:

public class meatvegStock {
    
//fields
  String item1;
  String item2;
  String item3;
  String item4;
  String item5;
  String item6;
  String item7;
  String item8;
  String item9;
  String item10;
  String item11;
  String item12;

  //constructor
    public meatvegStock(String item1, String item2, String item3, String item4, String item5, String item6, String item7, String item8, String item9, String item10, String item11) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
        this.item8 = item8;
        this.item9 = item9;
        this.item10 = item10;
        this.item11 = item11;
      
    }
  public void displayInfo() {
      System.out.println("Item 1: " + item1);
      System.out.println("Item 2: " + item2);
      System.out.println("Item 3: " + item3);
      System.out.println("Item 4: " + item4);
      System.out.println("Item 5: " + item5);
      System.out.println("Item 6: " + item6);
      System.out.println("Item 7: " + item7);
      System.out.println("Item 8: " + item8);
      System.out.println("Item 9: " + item9);
      System.out.println("Item 10: " + item10);
      System.out.println("Item 11: " + item11);
      
  }
  public static void main(String[] args) {
      meatvegStock Restock1 = new meatvegStock (
      "chicken breast (TDH)",
      "cooked chicken (c vale)",
      "spare rib meat (Ho Wan)",
      "pork neck (13.6kg)",
      "duck 2.6 county",
      "cooked duck breast",
      "king prawn (31/40)",
      "squid tubes",
      "crabmeat",
      "shrimp 100/200",
      "scallop");
      
      System.out.println("");
      Restock1.displayInfo();
  }
}

//when i finished the code above i realised it didnt look right as there was a bunch of repeats of the items etc
 
//I then refactored meatvegStock into MeatAndSeafood class using ArrayList for dynamic item handling - i will be using this structure for the rest of the other classes too before i create a stock management system.


// final version of the MeatandSeafood class.

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




// new update for the code, i created a superclass called StockCategory.java, 
// this way the codebase can cleaner and more modular by using OOP principles
    // i will be using this method for all of the classes.
    
    //StockCategory.java parent class:
    
    import java.util.ArrayList;

public class StockCategory {
    protected ArrayList<String> items;
    
    public StockCategory(ArrayList<String> items) {
        this.items = items;
    }
 public void addItem(String item){
     items.add(item);
 }   
 public void displayItems(String categoryName){
     System.out.println("===" + categoryName + "===");
     for (String item : items) {
         System.out.println("- " + item);
         
     }
 }
 public ArrayList<String> getItems() {
     return items;
 }
}


//Spices and seasonings child class:

import java.util.ArrayList;
public class spiceAndSeasonings extends StockCategory {
    
    public spiceAndSeasonings(ArrayList<String> items) {
    super(items);

    }
    public static void main(String[] args) {
        ArrayList<String> spiceList = new ArrayList<>();
        spiceList.add("MSG (L)");
        spiceList.add("Bay Leaves");
        spiceList.add("Ground white pepper");
        spiceList.add("white sugar ");
        spiceList.add("salt (L)");
        spiceList.add("Yellow ginger powder");
        spiceList.add("Curry powder (10kg)");
        spiceList.add("Red Curry Paste");
        spiceList.add("Green curry paste");
        spiceList.add("Wah loong mixed spice");
        spiceList.add("Food soda");
        spiceList.add("Star anise");
        spiceList.add("Cinnamon sticks");
        
        spiceAndSeasonings spiceStock = new spiceAndSeasonings(spiceList);
        spiceStock.displayItems("Spices and Seasonings");
    }
    
}

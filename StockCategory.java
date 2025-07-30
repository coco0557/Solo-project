//i have added notes to explain why i have used what i have used.


//add the desired import using (java.)
import java.util.ArrayList;

//create the fields while applying the import (ArrayList)
public class StockCategory {
    protected ArrayList<String> items;
    
    // add constructor
    public StockCategory(ArrayList<String> items) {
        this.items = items;
    }
    // create a method to add a new item to the list 
 public void addItem(String item){
     items.add(item);
 }   
 //create a method to display all the objects in the list including the title
 public void displayItems(String categoryName){
     System.out.println("===" + categoryName + "===");
     for (String item : items) {
         System.out.println("- " + item);
         
     }
 }
 // create a method to return the full list of items
 public ArrayList<String> getItems() {
     return items;
 }
}

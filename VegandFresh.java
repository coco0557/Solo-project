import java.util.ArrayList;

public class VegandFresh {
    private ArrayList<String> items;
    
    //constructor
    
    public VegandFresh(ArrayList<String> items) {
        this.items = items;
    }
    
    public void addItem(String item){
        items.add(item);
    }
    
    public void displayItems(){
        System.out.println("===Vege3table and fresh produce===");
for (String item : items) {
    System.out.println("- " + item);
}
    }
    public ArrayList<String> getItems(){
        return items;
    }
    public static void main(String[] args) {
        ArrayList<String> vegList = new ArrayList<>();
        vegList.add("Pak choi");
        vegList.add("Baby corn cob");
        vegList.add("Spring onion (Big head)");
        vegList.add("Bamboo strip small thin");
        vegList.add("Beansprouts");
        vegList.add("Garlic flake");
        vegList.add("Ginger");
        vegList.add("Peas");
        VegandFresh restock = new VegandFresh(vegList);
        restock.displayItems();
    }
    
}

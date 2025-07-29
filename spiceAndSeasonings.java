import java.util.ArrayList;
public class spiceAndSeasonings {
    //create the fields
    private ArrayList<String> items;
//create constructor
    public spiceAndSeasonings(ArrayList<String> items) {
        this.items = items;
    }
    //create an method to addItem
    public void addItem(String item){
        items.add(item);
    }
    //create method to display items
    public void displayItems() {
        System.out.println("===Spices And Seasonings"); // then add for string
for (String item : items){
    System.out.println("- " + item);
}
    }
    //create a return method - getItems
    public ArrayList<String> getItems(){
        return items;
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
    }
    
}

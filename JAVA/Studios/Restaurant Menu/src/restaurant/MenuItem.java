package restaurant;

import java.util.ArrayList;

public class MenuItem {

    public static int nextId = 1;

    private int id;
    private Double price;
    private String name;
    private String description;
    private String category;
    private int dateCreated;
    private int dateUpdated;
    private boolean isNew = true;

    ArrayList<String> menuItems =  new ArrayList<String>();

    public MenuItem (Double price, String name, String description, String category, int dateCreated, int dateUpdated, boolean isNew){
        this.id = nextId;
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.isNew = isNew;
        nextId++; //will incr

    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(int dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //construct new item

    //if item is new, print "New Item"

    public void newItem (String itemName){
        if (!menuItems.contains(itemName)){
            menuItems.add(itemName);
            isNew = true;

        }else{
            isNew = false;
        }
    }

    public void printIsNew (){
        if (this.isNew == true){
            System.out.println("New Item!");
        }
    }

    @Override
    public String toString(){
        String returnString = "";
        returnString += "Item price: " + this.price + "\n";
        returnString += "Item name: " + this.name + "\n";
        returnString += "Item description: " + this.description + "\n";
        returnString += "Item category: " + this.category + "\n";

        return returnString;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MenuItem)){
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;

        if (menuItem.price.equals(this.price)
            && menuItem.name.equals(this.name)
            && menuItem.description.equals(this.description)
            && menuItem.category.equals(this.category))
        return super.equals(obj);
    }
}

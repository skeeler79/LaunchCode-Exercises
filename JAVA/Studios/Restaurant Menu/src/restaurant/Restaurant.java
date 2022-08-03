package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> myBucket = new ArrayList<>();
        MenuItem pasta = new MenuItem(10.00, "Penne alla Vodka" ,
                "Penne with creamy tomato sauce", "main course", 80122, 80122, true);
        MenuItem cookies = new MenuItem((3.99, "BananaChip Cookies", "Gooey chocolate chip cookies with banana"))
        myBucket.add(pasta);
        pasta.printIsNew();

        Menu myMenu = new Menu(myBucket, new Date() );

    }
}


//this.price = price;
//        this.name = name;
//        this.description = description;
//        this.category = category;
//        this.dateCreated = dateCreated;
//        this.dateUpdated = dateUpdated;
//        this.isNew = isNew;
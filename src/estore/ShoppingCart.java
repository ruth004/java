package estore;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    private ArrayList<Items> items = new ArrayList<>();
}

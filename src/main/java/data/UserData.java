package data;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserData implements Serializable {
    private String name;
    private String description;
    private int price;
    private String garant;

    private static final ArrayList<Item> items
            = new ArrayList<>(Arrays.asList(
            new Item("Fridge" ,"Atlant", 1100,"23-03-2024"),
            new Item("Microwave" ,"LG", 960,"11-12-2023"),
            new Item("Electric brush" ,"Oral B", 169,"30-12-2024"),
            new Item("Neck massager" ,"X-tens", 632,"12-07-2025"),
            new Item("Laptop" ,"Asus", 1547,"03-06-2026")

    ));
    public ArrayList<Item> getItems() {
        return items;
    }

    public String addItems() {
        Item item = new Item(name,description,price,garant);
        items.add(item);
        return null;
    }




    public String sortAscendingPrice() {
        int n = items.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int q = items.get(j).compareTo(items.get(j + 1));
                if (q > 0) {
                    Item temp = items.get(j + 1);
                    items.set((j + 1), items.get(j));
                    items.set(j, temp);
                }
            }
        }
        return null;
    }

    public String sortAdescendingPrice() {
        sortAscendingPrice();
        Collections.reverse(items);
        return null;
    }


    public String sortAscendingData() throws ParseException {
        int n = items.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(items.get(j).compareTo(items.get(j+1).getGarant().toString())>0) {
                    Item temp = items.get(j);
                    items.set(j, items.get(j+1));
                    items.set(j+1, temp);
                }
            }
        }
        return null;
    }
    public String sortDescendingData() throws ParseException {
        int n = items.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(items.get(j).compareTo(items.get(j+1).getGarant().toString())<0) {
                    Item temp = items.get(j);
                    items.set(j, items.get(j+1));
                    items.set(j+1, temp);
                }
            }
        }
        return null;
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
    public void setDescription(String lastname) { this.description = lastname; }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setGarant(String garant) {
        this.garant = garant;
    }
    public String getGarant() {
        return garant;
    }
}






package data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String name;
    private String description;
    private int price;
    private String garant;


    public Item(String name, String description, int price, String garant ) {
        this.description=description;
        this.name = name;
        this.price=price;
        this.garant=garant;

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

    public String getGarant() {
        return garant;
    }

    public void setGarant(String garant) {
        this.garant = garant;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Item item) {
        int res = 0;
        if (this.price < item.getPrice()) {
            res = -1;
        }
        if (this.price > item.getPrice()) {
            res = 1;
        }
        return res;
    }

    public  int compareTo(String temp) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = sdf.parse(this.garant);
        Date date2 = sdf.parse(temp);
        return  (date1.compareTo(date2));
    }
}



package esercizioi_3;

public class Articolo {
    int articleCode;
    String description;
    int price;
    int warehouse;

    public Articolo(int articleCode, String description, int price, int warehouse) {
        this.articleCode = articleCode;
        this.description = description;
        this.price = price;
        this.warehouse = warehouse;
    }
}

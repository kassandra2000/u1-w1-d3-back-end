package esercizioi_3;

public class Carrello {
    Cliente client;
    Articolo article;
    int sum;

    public Carrello(Cliente client, Articolo article, int sum) {
        this.client = client;
        this.article = article;
        this.sum = sum;
    }
}

package esercizioi_3;

public class E_commerce {
    public static void main(String[] args) {
        Articolo art1 = new Articolo(1, "pc", 600, 4);
        Cliente cl1 = new Cliente(1, "Anna", "Asaro",
                "annaAsaro@gmail.com", 2004
        );
        Carrello cart1 = new Carrello(cl1, art1, 1);
    }
}

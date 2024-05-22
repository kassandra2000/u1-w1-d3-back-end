package esercizio_1;

public class Rettangolo {
    public static void main(String[] args) {

        Rettangolo rectangle1 = new Rettangolo(5, 7);
        rectangle1.stampaRettangolo();
        System.out.println("---------------------------------");

        //------------------due rettangoli metodo dentro classe r1------------------------
        Rettangolo rectangle2 = new Rettangolo(7, 9);
        rectangle1.stampaDueRettangoli(rectangle2);
        System.out.println("---------------------------------");

        //------------------due rettangoli metodo 2------------------------
        stampa2rettSum(rectangle1, rectangle2);
        System.out.println("---------------------------------");
    }

    public static void stampa2rettSum(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("perimetro " + rett1.perimeter());
        System.out.println("area " + rett1.area());
        System.out.println("perimetro2 " + rett2.perimeter());
        System.out.println("area2 " + rett2.area());
        int p2 = rett1.perimeter() + rett2.perimeter();
        int a2 = rett1.area() + rett2.area();
        System.out.println("la somma dei perimetri è: " + p2);
        System.out.println("la somma delle aree è: " + a2);
    }

    private int height;
    private int width;

    //costruttore
    public Rettangolo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perimeter() {
        return this.height * 2 + this.width * 2;
    }

    public int area() {
        return this.height * this.width;
    }

    public void stampaRettangolo() {
        System.out.println("il perimetro del rettangolo è: " + this.perimeter());
        System.out.println("L'area del rettangolo è: " + this.area());
    }

    public void stampaDueRettangoli(Rettangolo rett2) {
        System.out.println("il perimetro del rettangolo è: " + this.perimeter());
        System.out.println("L'area del rettangolo è: " + this.area());
        System.out.println("il perimetro del secondo rettangolo è: " + rett2.perimeter());
        System.out.println("L'area del secondo rettangolo è: " + rett2.area());
        int p2 = this.perimeter() + rett2.perimeter();
        int a2 = this.area() + rett2.area();

        System.out.println("la somma dei perimetri è: " + p2);
        System.out.println("la somma delle aree è: " + a2);
    }
}
